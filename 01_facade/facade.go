/**
*   @Time : 2019/7/3 18:10
*   @Author : wanghongli
*   @File : facade
*   @Software: GoLand
 */
package _1_facade

import "fmt"

func NewApi() API {
	return &apiImpl{
		a: NewAModuleAPI(),
		b: NewBModuleAPI(),
	}
}

//API is facade interface of facade package
type API interface {
	Test() string
}
type apiImpl struct {
	a AModuleAPI
	b BModuleAPI
}

func (a *apiImpl) Test() string {
	aRet := a.a.TestA()
	bRet := a.b.TestB()
	return fmt.Sprintf("%s\n%s", aRet, bRet)
}
func NewAModuleAPI() AModuleAPI {
	return &aModuleImpl{}
}

type AModuleAPI interface {
	TestA() string
}

type aModuleImpl struct {
}

func (*aModuleImpl) TestA() string {
	return "A module running..."
}
func NewBModuleAPI() BModuleAPI {
	return &bModuleImpl{}
}

type BModuleAPI interface {
	TestB() string
}
type bModuleImpl struct {
}

func (*bModuleImpl) TestB() string {
	return "B module running"
}
