function showPassword(button) {
	const input = button.previousElementSibling;

	if (input.type === 'password') {
		input.type = 'text';
		button.innerHTML = '<i class="ri-eye-off-line"></i>';
	}
	else {
		input.type = 'password';
		button.innerHTML = '<i class="ri-eye-line"></i>';
	}
}