form Box1HouseOwning {
hasSoldHouse: "Did you sell a house in 2010?" boolean
hasBoughtHouse: "Did you by a house in 2010?" boolean
hasMaintLoan: "Did you enter a loan for maintenance/reconstruction?" boolean
//This is a comment
if (hasSoldHouse) {
	sellingPrice: "Price the house was sold for:" integer
	if(hasMaintLoan){
		reallyAddicted: "Private debts for the sold house:" integer
	}
	notsomuch: "Private debts for the sold house:" integer = (reallyAddicted)
}
if(sellingPrice > 5 *(2+1)){
	privateDebt: "Private debts for the sold house:" integer 
	valueResidue: "Value residue:" integer
}

}