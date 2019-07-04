/**
*   @Time : 2019/7/4 15:14
*   @Author : wanghongli
*   @File : singleton
*   @Software: GoLand
 */
package _3_singleton

import "sync"

//Singleton是单例模式类
type SingleTon struct {
}

var singleTon *SingleTon
var once sync.Once

func GetInstance() *SingleTon {
	once.Do(func() {
		singleTon = &SingleTon{}
	})
	return singleTon
}
