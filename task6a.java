IntStream stream = IntStream
		.iterate(2, i -> i + 1)
		.filter(i -> IntStream.range(2, i)
				.filter(j -> (i % j == 0))
				.findAny()
				.isEmpty());
stream.limit(5).forEach(v -> System.out.println(v));