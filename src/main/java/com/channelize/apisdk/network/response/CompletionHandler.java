package com.channelize.apisdk.network.response;

/**
 * Completion handler callback. It's the main interface for getting the results or errors from
 * the network requests
 * @param <T>
 */
public interface CompletionHandler <T> {
    void onComplete(T result, ChannelizeError error);
}
