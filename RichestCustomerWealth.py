from typing import List

class RichestCustomerWealth:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_wealth = 0 
        
        for customer in accounts:
            customer_wealth = sum(customer)
            max_wealth = max(max_wealth, customer_wealth)
            
        return max_wealth

def main():
    accounts = [[1,2,3],[3,2,1]]
    solution = Solution()
    max_wealth = solution.maximumWealth(accounts)
    print(max_wealth)

    accounts = [[1,5],[7,3],[3,5]]
    max_wealth = solution.maximumWealth(accounts)    
    print(max_wealth)

if __name__ == "__main__":
    main()
