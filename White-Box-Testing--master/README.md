# 白盒测试训练实验报告

## 截图
![screenshort](https://github.com/XiaoMuxin/White-Box-Testing-/blob/master/White-Box-Testing--master/IMG/screenshort.png)

## bug报告

在Method4()中，当遇到if((a == b) || ((c == d) && (bug(a))))分支时，如果均判断为false，从而不对x进行赋值操作，x仍然为0，此时e=1/x语句中会出现除0操作，从而运行失败。

在miniCalculator()中，由于函数类型为double,无法对op输入为非法字符时进行处理，也无法对op为‘/’且b=0时的除0非法操作进行处理。
