
letter_dict={}

def mostCommonChar(input):
    for char in input:
        if char in letter_dict:
            letter_dict[char] +=1
        else:
            letter_dict[char] =1

    most_letter = None
    most_number = 0
    for char in letter_dict:
        if letter_dict[char] > most_number:
            most_number = letter_dict[char]
            most_letter = char
    return most_number, most_letter

def isPalindrome(input):
    text_string = str(input)
    return text_string == text_string[::-1]
    
input_string = input("Give me a sentance: ")
num, letter = mostCommonChar(input_string)
print(f"{letter} appears {num} times")
print(isPalindrome(input_string))




