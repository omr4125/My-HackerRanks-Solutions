import java.util.Arrays;

public class AlmostIncreasingSequence {

	/*
	 	Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence 
	 	by removing no more than one element from the array.

		Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
		Sequence containing only one element is also considered to be strictly increasing.
	 */
	boolean b;
	public static void main(String[] args) {

		int[] sequence = {1,2,3,4,1,5,6,7,8,9,10,11};
		System.out.println(new AlmostIncreasingSequence().almostIncreasingSequence(sequence));
	}
	
	boolean almostIncreasingSequence(int[] sequence) {

		boolean flag=true;
	    int seq1=0;
	    int seq2=0;
	    for(int i=0;i<sequence.length-1;i++){
	        if(sequence[i]>=sequence[i+1]) seq1++;
	    }
	    for(int k=0;k<sequence.length-2;k++){
	        if(sequence[k]>=sequence[k+2]) seq2++;
	    }
	    if(seq1+seq2>2) flag=false;
	    return flag;
	}
}
