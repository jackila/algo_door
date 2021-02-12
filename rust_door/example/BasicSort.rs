fn main() {
    let mut un_order_num = [2, 9, 1, 5, 4];

    select_sort(&mut un_order_num);
    for num in un_order_num.iter() {
        print!("{},", num);
    }
}
#[allow(dead_code)]
fn bubble_sort(nums: &mut [usize]) {
    let mut index = nums.len();
    let len = nums.len();
    while index > 0 {
        for pos in 0..len - 1 {
            if pos >= index - 1 {
                continue;
            }

            if nums[pos] > nums[pos + 1] {
                nums.swap(pos, pos + 1);
            }
        }
        index = index - 1;
    }
}

#[allow(dead_code)]
fn insert_sort(nums: &mut [usize]) {
    let len = nums.len();
    for pos in 1..len {
        let value = nums[pos].clone();
        let mut index = pos.clone();

        for i in (0..pos).rev() {
            if nums[i] > value {
                index = i;
                nums.swap(i, i + 1);
            }
        }
        nums[index] = value;
    }
}

fn select_sort(nums: &mut [usize]) {
    let len = nums.len();
    for pos in 0..len - 1 {
        let mut min = pos;
        for zpos in pos..len {
            if nums[zpos] < nums[min] {
                min = zpos;
            }
        }
        nums.swap(pos, min);
    }
}
