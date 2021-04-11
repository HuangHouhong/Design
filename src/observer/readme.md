# 观察者模式

## simple 文件夹
最简单的观察者的实现
- ConcreteObserver: 具体的观察者
- ConcreteSubject: 具体的主题
- IObserver: 抽象观察者  
- ISubject: 抽象主题

## java文件夹
使用java内置的Observer接口实现观察者模式。
题干：股东监听股票的价格。
- ShareHolderObserver: 股东，即具体观察者。
- SharesObservable: 股票，即具体的主题。