.PHONY: clean All

All:
	@echo "----------Building project:[ gumball_c_ver1 - Debug ]----------"
	@cd "gumball_c_ver1" && $(MAKE) -f  "gumball_c_ver1.mk"
clean:
	@echo "----------Cleaning project:[ gumball_c_ver1 - Debug ]----------"
	@cd "gumball_c_ver1" && $(MAKE) -f  "gumball_c_ver1.mk" clean
