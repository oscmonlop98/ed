using System;

namespace CVector
{
    class Vector
    {
        public static void Main(string[] args)


        {
            Array.ForEach(new int[] { 3, 5, 7}, item => Console.WriteLine("item=" + item));
        }

        public static int BinarySearch(int[] v, int x) {
            int count = v.Length;
            if (count == 0)
                return -1;
            int left = 0;
            int right = count - 1;
            int middle = (left + right) / 2;
            while (left < right && v[middle] != x) {
                if (middle < x)
                    left = middle + 1;
                else
                    right = middle - 1;
                middle = (left + right) / 2;
            }
            if (left > right)
                return -1;
            if (v[middle] == x)
                return middle;
            return -1;
        }
    }
}
