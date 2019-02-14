## Change Java version Mac OS

### Console/shell

First run /usr/libexec/java_home -V which will output something like the following:

```console
/usr/libexec/java_home -V
```
```console
Matching Java Virtual Machines (2):
    11.0.1, x86_64:     "Java SE 11.0.1"        /Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home
    1.8.0_171, x86_64:  "Java SE 8"     /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home

/Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home
```
Pick the version you want to be the default (1.8.0_171 for arguments sake) then:
```
export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_171`
export JAVA_HOME=`/usr/libexec/java_home -v 11.0.1`
```



