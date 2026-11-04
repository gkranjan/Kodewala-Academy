package com.wholeInterface.bankingProcessingSystem;

/**
 * This is the functional interface
 */
@FunctionalInterface
public interface ITransactionLogger {

	void log(String message);
}
