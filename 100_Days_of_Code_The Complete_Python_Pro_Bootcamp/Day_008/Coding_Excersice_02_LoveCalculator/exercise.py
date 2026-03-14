def calculate_love_score(name1, name2):
    true_list = ["t","r", "u", "e"]
    love_list = ["l", "o", "v","e"]
    
    score1 = 0
    score2 = 0
    
    
    for i in range(len(true_list)):
        if name1.find(true_list[i]):
            score1 += name1.count(true_list[i])
            
        if name2.find(true_list[i]):
            score1 += name2.count(true_list[i])
    
    for i in range(len(love_list)):
        if name1.find(love_list[i]):
            score2 += name1.count(love_list[i])
            
        if name2.find(love_list[i]):
            score2 += name2.count(love_list[i])
    
        
    print(f"{score1}{score2}")
