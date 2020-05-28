# strategy-demo
利用策略模式消除if-else

**优势**
1. 减少了if-else嵌套，代码更加优雅
2. 添加新需求不需要动既有代码，只需要新添加支持策略类即可

**各类作用简介**
1. TypeEnum枚举：标注本策略支持的格式
2. StrategyTypeHandler注解：标注具体的策略类所属格式
3. Strategy接口：定义公共方法方便子类
4. XxxStrategy类：Strategy接口的实现类，用于实现各自自身逻辑
5. StrategyContext类：策略存储容器，用于获取某个策略执行者
6. StrategyListener类：用于初始化策略容器

**添加新类型支持**
1. 在TypeEnum枚举中添加新支持格式的枚举
2. 添加一个类实现Strategy接口，并在类上加上StrategyTypeHandler注解，标注其格式类型即可