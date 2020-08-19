package org.gabriel.solid.open_closed;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author daohn on 19/08/2020
 * @project design-pattern-course
 */
public class CallHistory {

    public static class Call {

        private final long subscriberId;
        private final LocalDateTime begin;
        private final long duration;

        public Call(long subscriberId, LocalDateTime begin, long duration) {
            this.subscriberId = subscriberId;
            this.begin = begin;
            this.duration = duration;
        }

        public long getSubscriberId() {
            return subscriberId;
        }

        public LocalDateTime getBegin() {
            return begin;
        }

        public long getDuration() {
            return duration;
        }

        public long getDuration(Call call) {
            return 0;
        }
    }

    private static final Map<Long, List<Call>> CALLS = new HashMap<>();


    public synchronized static List<Call> getCurrentCalls(Long subscriberId) {
        if(!CALLS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return CALLS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin,
                                               long duration) {
        List<Call> calls;
        if(!CALLS.containsKey(subscriberId)) {
            calls = new LinkedList<>();
            CALLS.put(subscriberId, calls);
        } else {
            calls = CALLS.get(subscriberId);
        }
        calls.add(new Call(subscriberId, begin, duration));
    }
}
