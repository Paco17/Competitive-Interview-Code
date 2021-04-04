

let rotate = (array,k) => {
    k%=array.length;
    reverse(array, 0, array.length-1);
    reverse(array, 0, k-1);
    reverse(array, k, array.length-1);

};

let reverse = (array, low, high) => {
    while(low<high){
        let tmp = array[high];
        array[high] = array[low];
        array[low] = tmp;
        high--;
        low++;
    }
};



let array1 = [1,2,3,4,5,6];
rotate(array1, 3);
array1.forEach(element => {
    console.log(element);
});
