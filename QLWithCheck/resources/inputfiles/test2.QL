form Box1HouseOwning {
	valueResidue: "Value residue:" integer
	value4: "value4" string $ (length > 2)
	
	calculated: "ValueResidue +1 " integer = (valueResidue + 1)
}