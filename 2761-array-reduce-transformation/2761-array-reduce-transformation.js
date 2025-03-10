/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    n = nums.length;
    val = init;
    for(let i=0;i<n;i++){
        val = fn(val,nums[i])
    }
    return val;
};