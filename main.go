package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	wordsRepeated := make(map[string]int)

	in, err := os.Open("./in")
	if err != nil {
		fmt.Fprintln(os.Stderr, "Error during the opening of file: ", err.Error())
	}
	defer in.Close()

	scanner := bufio.NewScanner(in)
	for scanner.Scan() {
		sentence := scanner.Text()
		words := strings.Split(sentence, " ")
		for _, word := range words {
			appearance := wordsRepeated[word]
			if appearance == 0 {
				wordsRepeated[word] = 1
			} else {
				wordsRepeated[word] = appearance + 1
			}
		}
	}

	out, err := os.Create("./out")
	if err != nil {
		fmt.Fprintln(os.Stderr, "Error during the creation of file: ", err.Error())
	}
	defer out.Close()

	for word, appearance := range wordsRepeated {
		if appearance > 1 {
			_, err := out.WriteString("Word: " + word + " | Appeared: " + strconv.Itoa(appearance) + " times\n")
			if err != nil {
				fmt.Fprintln(os.Stderr, "Error during write of lines: ", err.Error())
			}
		}
	}
}
