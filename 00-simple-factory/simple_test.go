/**
*   @Time : 2019/7/3 15:58
*   @Author : wanghongli
*   @File : simple_test
*   @Software: GoLand
 */
package _0_simple_factory

import (
	"fmt"
	"testing"
)

func TestHiApi_Say(t *testing.T) {
	api := NewApi(1)
	name := api.Say("kitty")
	fmt.Println(name)
}

func TestHelloApi_Say(t *testing.T) {
	api := NewApi(2)
	name := api.Say("kitty")
	fmt.Println(name)
}
