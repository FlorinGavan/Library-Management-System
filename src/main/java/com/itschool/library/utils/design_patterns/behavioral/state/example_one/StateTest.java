package com.itschool.library.utils.design_patterns.behavioral.state.example_one;

public class StateTest {

    public static void main(String[] args) {

    TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();
		context.setState(tvStopState);
		context.doAction();
    }
}
