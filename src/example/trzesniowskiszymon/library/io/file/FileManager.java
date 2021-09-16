package example.trzesniowskiszymon.library.io.file;

import example.trzesniowskiszymon.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
