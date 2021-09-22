# W02

## 任务一

1. 类图：![](http://www.plantuml.com/plantuml/png/ZLJDRi8m3BxtANBS3tq7nc5eqgIXmNQPTWYjWMXfKkM7do7UVKxTT4t40Gwj-pd-R7zsc5h7ZVEDB5wK0xFX5R2bDcWMvuBXxt6lHSsavlNT_GYmU2O2IsU4sh8jk8Na2j5BKKbkBNiL2dgQSg6jS4Ahhs_MzgOTyRL-eCCelfQ0V7a6fyd8JYAbqq_6y1CwCBaOEWa5X1D9BnPSB2OITTzQXPIv2ya2_CcbXr5hSu3VGQFoZ2ewKLq8PMu7P5tr8jig7kYpb2GvizqhhPLScH9IAFXeOpI1GLbkBD0GoDEHm14gxu340UKRDjVUr4mqhOG6bBEvK6yA9cnrqFZO6K3x6GFmAVPeByKH7x07DQ4a6w6uP44eamFR75Ydsp3i0dKtAEMvgODGQ40zExrpzJCUYA7lwxjnmwX5Ekiqvi3R6vTWvjUeMHZGMCla-fGOYeFXr-zI6JDcesGjpl2ssqReK5AiFAQFbqdIEzM6dDGHsi0UolAVWPOaWQBHeSFEq2e7h6zz2geEVob_)
2. 时序图：![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCBialKd1FJQrABU9ApIl9BAbKS2fDIif93SulAaajKb1EoYbDXSdaPEQbAYWek-Vdf71nWJcwTY3Awcd7tAVBkv_sJ8l9UxAZ-ScELIychdxHjUpfYkRdgsS-wvZmP4V3ixv9N11xW9eW3Ald7Tk1wDdSfKzsjN4Xh0KhGUPQFMsRz6ppGg0HJtVrFstVzRnl0wQEQ6N7mjB4M3Ip-tgUzKCrFfksyzdcgM17GDJxPEQcna8y05JnSiPye6EVBjtBnUMGcfS231q0)
3. `example`的设计理念：
   - 作为面向对象程序设计，实现老爷爷指挥七个葫芦娃站队，就要创建出若干对象来完成这一过程——老爷爷，排序方法，队伍。排序方法作为一个对象，对象中包含将给定参数排序的方法。队伍相当于一个数组，7个位置每一个位置存放一个葫芦娃对象。老爷爷作为这一过程的操作者，他需要掌握排序方法，然后运用排序方法将队伍排好顺序。
   - `Gourd`是一个枚举对象，`Gourd.One`也是一个包含若干方法的对象，可以预先定义颜色初值。`BuddleSort`是从`Sorter`派生的具体的排序方法，可以读取序列，排序后生成逐步的过程。`Position`中用来存放`Linable`，由于`Gourd`继承自`Linable`，向上转型`Position`也可以存放`Gourd`对象。`Gourd`对象中又有`Position`对象，可以用来返回`Gourd`的位置信息。`Line`则是队伍对象，其中包含`Position`对象的数组，用来存放`Position`对象的应用。`Geezer`是老爷爷对象，掌握排序方法，可以命令队伍进行排序。
   - 程序执行的过程：
     + 初始化队伍，将葫芦娃存放到队伍中的位置数组中
     + 老爷爷初始化
     + 排序对象初始化
     + 老爷爷掌握排序方法
     + 老爷爷命令队伍进行排序
   - 好处：
     + 当然是代码短小精悍
     + 一目了然（bushi）,可读性强
     + 复用性强，可拓展性强
     + 可移植性强，稍微改改任务二三就写完了
     + 可维护性好，各个对象分工明确，单独处理
   - 可改进：
     + `Line.java`变量声明应该在构造函数之前        ——虎刺梅

## 任务二

1. 类图：![](http://www.plantuml.com/plantuml/png/pLJDZjGm3BxtANBaHts7PIM4aFQmCC05SN1RjnCravGaPLcDvjsnqoJJb47gWSFsKkTpR7-VdUJEUR1-Fgdge_PeUsXH78mbipfNWhwtlupiX3BGlNgz0XpjIS31Mwa7CQ1_LA09lLIj0kV4WzGOqzIFnaalZVx-GqpHTAjyqvpJKHGq2YdVje8tYx7PIIczUMSjF9E3YikiX0dmZaABGv_8f4HXRJINtBee6SFVGCsuadRGC6PjP-V1o_P2O3iAVyHWtF9HfY_H7GlKIxU52x-IvkBQD46HfgzJZWuWDnMiG-v_yeGa-1lRsJFnpFozweKyJGfFgBtRjgZkfGObMBNT0iCMQChHvi4kV9Fo3pFOZfLJvVldpw37TM_jZRKTcdzEViSWPJd9CkO9ffqZlfyRwWlFODsludBK54gzXzitfSuLosc9IO7UUvSOlPuwLDWozHV5wjCist4_8ruGeQVhuYY7urwol7y2w_C4ywwVJ8DP_ozT3zBncOqQo289gFg_dgqSa0vMKfrUChNyowCRdI6SR1HlwlgQWQgLG382cYzjU8OOYksEb1bXvdUeEtxR_m00)

2. 可视化结果：
   + QuickSort 64:[![ ](https://asciinema.org/a/5Z0xyDpzUHOqYyCWE1VNNuHOj.svg)](https://asciinema.org/a/5Z0xyDpzUHOqYyCWE1VNNuHOj)
   + SelectionSort 64:[![asciicast](https://asciinema.org/a/qai936F1zB4GIRoVtAUbwkB8m.svg)](https://asciinema.org/a/qai936F1zB4GIRoVtAUbwkB8m)

​            

## 任务三

1. 类图：![](http://www.plantuml.com/plantuml/png/pLJDZjGm3BxtANBaHts7PIM4aFQmCC05SN1RjnCravGaPLcDvjsnqoJJb47gWSFsKkTpR7-VdUJEUR1-Fgdge_PeUsXH78mbipfNWhwtlupiX3BGlNgz0XpjIS31Mwa7CQ1_LA09lLIj0kV4WzGOqzIFnaalZVx-GqpHTAjyqvpJKHGq2YdVje8tYx7PIIczUMSjF9E3YikiX0dmZaABGv_8f4HXRJINtBee6SFVGCsuadRGC6PjP-V1o_P2O3iAVyHWtF9HfY_H7GlKIxU52x-IvkBQD46HfgzJZWuWDnMiG-v_yeGa-1lRsJFnpFozweKyJGfFgBtRjgZkfGObMBNT0iCMQChHvi4kV9Fo3pFOZfLJvVldpw37TM_jZRKTcdzEViSWPJd9CkO9ffqZlfyRwWlFODsludBK54gzXzitfSuLosc9IO7UUvSOlPuwLDWozHV5wjCist4_8ruGeQVhuYY7urwol7y2w_C4ywwVJ8DP_ozT3zBncOqQo289gFg_dgqSa0vMKfrUChNyowCRdI6SR1HlwlgQWQgLG382cYzjU8OOYksEb1bXvdUeEtxR_m00)
2. SelectionSort 8*8:[![asciicast](https://asciinema.org/a/437062.svg)](https://asciinema.org/a/437062)
3. QuickSort 8*8:[![asciicast](https://asciinema.org/a/437063.svg)](https://asciinema.org/a/437063)