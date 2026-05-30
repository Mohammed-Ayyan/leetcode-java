def reverse_integer_math(n: int) -> int:
    sign = -1 if n < 0 else 1
    num = abs(n)
    reversed_num = 0
    
    while num > 0:
        last_digit = num % 10
        reversed_num = (reversed_num * 10) + last_digit
        num //= 10
        
    return sign * reversed_num

print(reverse_integer_math(1234))   