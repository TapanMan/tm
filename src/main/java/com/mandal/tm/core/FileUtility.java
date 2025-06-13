package com.mandal.tm.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileUtility {
    private FileUtility() {
        throw new IllegalStateException("FileUtility class");
    }

    private static final Logger fileUtilityLogger = LogManager.getLogger(FileUtility.class);

    private static final String PROP_MAX_ALLOWED_FILE_SIZE = "max.allowed.filesize";

    public static boolean isWithinSizeLimit(File file) {
        boolean flag = true;
        double fileSizeLimitMB = Double.parseDouble(PROP_MAX_ALLOWED_FILE_SIZE);
        double fileSizeMB = ((double) file.length() / 1024) / 1024;
        if (fileSizeMB <= fileSizeLimitMB) {
            flag = false;
        } else {
            flag = true;
            moveCompletedFile(file);
        }
        return flag;
    }

    private static void moveCompletedFile(File file) {
        try {
            Path moveFrom = Paths.get(file.getPath());
            if (Files.exists(moveFrom, LinkOption.NOFOLLOW_LINKS)) {
                File theDir = new File(moveFrom.getParent() + File.separator + "errorFile");
                if (!theDir.exists()) {
                    theDir.mkdir();
                }
                Path moveTo = Paths.get(theDir.getPath() + File.separator + file.getName());
                Files.move(moveFrom, moveTo, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            fileUtilityLogger.error(e);
        }
    }

    public static void createDirectoryIfNotExist(String directoryPath) throws IOException {
        try {
            Path pathDynamic = Paths.get(directoryPath);
            if (!(Files.exists(pathDynamic))) {
                Files.createDirectories(Paths.get(directoryPath));
            }
        } catch (IOException exception) {
            throw new IOException(exception);
        }
    }
}
