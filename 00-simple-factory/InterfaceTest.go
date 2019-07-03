/**
*   @Time : 2019/7/3 17:05
*   @Author : wanghongli
*   @File : InterfaceTest
*   @Software: GoLand
 */
package _0_simple_factory

import "fmt"

type People interface {
	ReturnName() string
}
type Role interface {
	People //接口嵌套
	ReturnRole() string
}
type Student struct {
	Name string
}

func (s Student) ReturnName() string {
	return s.Name
}

func (s Student) ReturnRole() string {
	return "学生"
}

func main() {
	cbs := Student{Name: "www"}
	var a Role
	a = cbs
	name := a.ReturnName()
	fmt.Println(name)
	role := a.ReturnRole()
	fmt.Println(role)
}
