let twoSum  = (nums, target) => {
    const comp = {};
    for(let i=0; i< nums.length; i++){
        if(comp[nums[i] ]>=0){
            return [ comp[nums[i] ], i];
        }
        comp[target-nums[i]] = i;
    }
}; 

let array = [2,7,11,15];
console.log(twoSum(array, 9));