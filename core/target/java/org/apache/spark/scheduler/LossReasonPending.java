package org.apache.spark.scheduler;
// no position
/**
 * A loss reason that means we don't yet know why the executor exited.
 * <p>
 * This is used by the task scheduler to remove state associated with the executor, but
 * not yet fail any tasks that were running in the executor before the real loss reason
 * is known.
 */
  class LossReasonPending extends org.apache.spark.scheduler.ExecutorLossReason {
}
