.PHONY: clean All

All:
	@echo "----------Building project:[ gumball_c_ver2 - Debug ]----------"
	@cd "gumball_c_ver2" && $(MAKE) -f  "gumball_c_ver2.mk"
clean:
	@echo "----------Cleaning project:[ gumball_c_ver2 - Debug ]----------"
	@cd "gumball_c_ver2" && $(MAKE) -f  "gumball_c_ver2.mk" clean
