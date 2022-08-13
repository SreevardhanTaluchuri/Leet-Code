package main

import (
	"fmt"
)

func twoSum(nums []int, target int) [2]int{
	ans := [2]int{0,0};
	for index, num := range nums {
		diff := target - num
		for i:= index+1; i<len(nums); i++ {
			if nums[i] == diff{
				ans[0] = index;
				ans[1] = i;

				return ans;
			}
		}
	}
	 return ans;
}

func main() {
	nums := []int{3,3};
	var target int = 6;
	fmt.Println(twoSum(nums,target))
}