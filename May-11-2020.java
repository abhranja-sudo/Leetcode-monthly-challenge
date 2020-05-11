
// An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

// Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

// To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

// At the end, return the modified image.


class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        track =  [[0 for x in range(len(image[0]))] for y in range(len(image))] 
        print(track)
        print(image)
        def helper(image: List[List[int]], sr: int, sc: int, newColor: int, initialColor: int, track: List[List[int]]):
            if sr<0 or sc<0 or sr>=len(image) or sc>=len(image[0]) or track[sr][sc] == 1:
                return
            if(image[sr][sc] == initialCoAn image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.lor):
                image[sr][sc] = newColor
                track[sr][sc] = 1
                helper(image, sr+1, sc, newColor, initialColor,track)      
                helper(image, sr-1, sc, newColor, initialColor,track)  
                helper(image, sr, sc+1, newColor, initialColor,track)  
                helper(image, sr, sc-1, newColor, initialColor,track) 
            else:
                return
        helper(image,sr,sc,newColor, image[sr][sc],track)
        return image