
## 转写等级

- Level0 实时读取 




## PHP 特性支持列表

### 已支持的特性

### 暂不支持的特性

### 不准备支持的特性

- 不支持执行shell命令的能力。包括 ShellExec 语法，`exec()`、`system()`等函数
- 不支持动态执行php代码的能力。包括 `eval` 语法。

ps
1. ShellExec 指如下语法
```php
$value = `pwd`;
```