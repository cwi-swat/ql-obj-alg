form Box1HouseOwning {
	valueResidue: "Value residue:" integer $ (value > 10)
	valueResidueMod:  "value mod 10:" integer = (valueResidue % 10)
}