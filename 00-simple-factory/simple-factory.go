/**
*   @Time : 2019/7/3 15:54
*   @Author : wanghongli
*   @File : simple-factory
*   @Software: GoLand
 */
package _0_simple_factory

import "fmt"

type API interface {
	Say(name string) string
}

func NewApi(t int) API {
	if t == 1 {
		return &hiApi{}
	} else if t == 2 {
		return &helloApi{}
	}
	return nil
}

type hiApi struct{}

func (*hiApi) Say(name string) string {
	return fmt.Sprintf("Hi %s", name)
}

type helloApi struct {
}

func (*helloApi) Say(name string) string {
	return fmt.Sprintf("hello %s", name)
}
