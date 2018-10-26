
package Facade_Pattern;

public interface ScheduleServerInterface {
    
    void startBooting();
    void readSystemConfigFile();
    void init();
    void initializeContext();
    void initializeListeners();
    void createSystemObjects();
    void releaseProcesses();
    void destroy();
    void destroySystemObjects();
    void destroyListeners();
    void destroyContext();
    void shutDown();
}
