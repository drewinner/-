/**
*   @Time : 2019/7/4 15:17
*   @Author : wanghongli
*   @File : singleton_test
*   @Software: GoLand
 */
package _3_singleton

import (
	"fmt"
	"testing"
)

func TestGetInstance(t *testing.T) {
	ins1 := GetInstance()
	ins2 := GetInstance()
	fmt.Printf("%p\n", ins1)
	fmt.Printf("%p", ins2)
}
