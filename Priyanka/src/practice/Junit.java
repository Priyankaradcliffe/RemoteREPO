package practice;

public class Junit {

	public int add(int a, int b) {
		int c = a + b;
		return c;	
	}
	
}

//Junit frame work is mostluy used by devs for unit tests / Test NG might also be used interchangeably
int a = 1 ;
int b = 2;
-------
int testResult = testClass.add(a, b)
--------
expect(testResult).toBe(3);
/*test-data ready  - dummy data
actual method call - dummy data pass
compare the expected result to actual result
*/

JSON - is a placeholder to hold data; in a key value pair 
[{key : value}, {name: 'priyanka'}, 
					{results: [{page1: [{firstresult link: [{ images: https://goog},{articles: http://}]}]}, {page2: []}]}];

XML
<name> Priyanka </name> 
