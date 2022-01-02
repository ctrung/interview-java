## 1.5
### Generics
See [dedicated page](generics)

## 9
### Jigsaw - modules
See [dedicated page](modules)

### Process API (new)
New classes *java.lang.ProcessHandler* and *java.lang.ProcessHandler.Info*.
```java
ProcessHandle.allProcesses()
    .filter(p -> p.info().command().isPresent())
    .limit(5)
    .forEach(p -> {
        System.out.println("PID - " + p.pid());
        System.out.println("Command - " + p.info().command().orElse(null));
        System.out.println("Command-line - " + p.info().commandLine().orElse(null));
        System.out.println("Command-args - " + Arrays.toString(p.info().arguments().orElse(null)));
        System.out.println("Start-time - " + p.info().startInstant().orElse(null));
        System.out.println("Total-CPU-duration - " + p.info().totalCpuDuration().orElse(null));
        System.out.println("User - " + p.info().user().orElse(null) + "\n");
    });
```
