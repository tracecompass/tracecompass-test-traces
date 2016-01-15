/*******************************************************************************
 * Copyright (c) 2013, 2015 Ericsson, Efficios Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.tracecompass.testtraces.ctf;

import java.net.URL;

/**
 * Here is the list of the available test traces for the CTF parser.
 *
 * @author Alexandre Montplaisir
 */
public enum CtfTestTrace {
    /**
     * Example kernel trace
     *
     * <pre>
     * Trace Size: 13 MB
     * Tracer: lttng-modules 2.0.0
     * Event count: 695 319
     * Kernel version: 3.0.0-16-generic-pae
     * Trace length: 10s
     * </pre>
     */
    KERNEL("/kernel", 695319, 10),

    /**
     * Another kernel trace
     *
     * <pre>
     * Trace Size: 14 MB
     * Tracer: lttng-modules 2.0.0
     * Event count: 595 641
     * Kernel version: 3.2.0-18-generic
     * Trace length: 11s
     * </pre>
     */
    TRACE2("/trace2", 595641, 11),

    /**
     * Kernel trace with event contexts: pid, ppid, tid, procname,
     * perf_page_fault, perf_major_faults, perf_minor_faults
     *
     * <pre>
     * Trace Size: 56 MB
     * Tracer: lttng-modules 2.1.0
     * Event count: 714 484
     * Kernel version: 3.8.1
     * Trace length: 29s
     * </pre>
     */
    KERNEL_VM("/kernel_vm", 714484, 29),

    /**
     * Kernel trace with all events enabled. Contains 'inet_sock_local_*' events
     * provided by Francis's Giraldeau lttng-modules addons branch to trace TCP
     * events. Can be used along with {@link CtfTestTrace#SYNC_DEST} for trace
     * synchronization.
     *
     * <pre>
     * Trace Size: 2.4 MB
     * Tracer: lttng-modules 2.1.0
     * Event count: 110 771
     * Kernel version: 3.6.11-1-ARCH
     * Trace length: 23s
     * </pre>
     */
    SYNC_SRC("/synctraces/scp_src", 110771, 23),

    /**
     * Kernel trace with all events enabled. Contains 'inet_sock_local_*' events
     * provided by Francis's Giraldeau lttng-modules addons branch to trace TCP
     * events. Can be used along with {@link CtfTestTrace#SYNC_SRC} for trace
     * synchronization.
     *
     * <pre>
     * Trace Size: 1.9 MB
     * Tracer: lttng-modules 2.1.0
     * Event count: 85 729
     * Kernel version: 3.6.11-1-ARCH
     * Trace length: 17s
     * </pre>
     */
    SYNC_DEST("/synctraces/scp_dest", 85729, 17),

    /**
     * LTTng Kernel trace. Contains 'inet_sock_local_*' events provided by
     * Francis's Giraldeau lttng-modules addons branch to trace TCP events. Can
     * be used along with {@link CtfTestTrace#DJANGO_DB} and
     * {@link CtfTestTrace#DJANGO_HTTPD} for trace synchronization.
     *
     * <pre>
     * Trace Size: 33 MB
     * Tracer: lttng-modules 2.4.0
     * Event count: 754 787
     * Kernel version: 3.13.0-24-generic
     * Trace length: 15s
     * </pre>
     */
    DJANGO_CLIENT("/django-benchmark/django-client", 754787, 15),

    /**
     * LTTng Kernel trace. Contains 'inet_sock_local_*' events provided by
     * Francis's Giraldeau lttng-modules addons branch to trace TCP events. Can
     * be used along with {@link CtfTestTrace#DJANGO_CLIENT} and
     * {@link CtfTestTrace#DJANGO_HTTPD} for trace synchronization.
     *
     * <pre>
     * Trace Size: 28 MB
     * Tracer: lttng-modules 2.4.0
     * Event count: 692 098
     * Kernel version: 3.13.0-24-generic
     * Trace length: 14s
     * </pre>
     */
    DJANGO_DB("/django-benchmark/django-db", 692098, 14),

    /**
     * LTTng Kernel trace. Contains 'inet_sock_local_*' events provided by
     * Francis's Giraldeau lttng-modules addons branch to trace TCP events. Can
     * be used along with {@link CtfTestTrace#DJANGO_DB} and
     * {@link CtfTestTrace#DJANGO_CLIENT} for trace synchronization.
     *
     * <pre>
     * Trace Size: 31 MB
     * Tracer: lttng-modules 2.4.0
     * Event count: 779 096
     * Kernel version:3.13.0-24-generic
     * Trace length: 13s
     * </pre>
     */
    DJANGO_HTTPD("/django-benchmark/django-httpd", 779096, 13),

    /**
     * UST trace with lots of lost events
     *
     * <pre>
     * Trace Size: 3.4 MB
     * Tracer: lttng-ust 2.3
     * Event count: 1 000 000, with 967 700 lost events
     * Trace length: 279ms
     * </pre>
     */
    HELLO_LOST("/hello-lost", 1000000, 0),

    /**
     * UST trace with lttng-ust-cyg-profile events (aka -finstrument-functions)
     *
     * <pre>
     * Trace Size: 236 KB
     * Tracer: lttng-ust 2.3
     * Event count: 4 977
     * Trace length: 10s
     * </pre>
     */
    CYG_PROFILE("/cyg-profile/glxgears-cyg-profile", 4977, 10),

    /**
     * UST trace with lttng-ust-cyg-profile-fast events (no address in
     * func_exit)
     *
     * <pre>
     * Trace Size: 184 KB
     * Tracer: lttng-ust 2.3
     * Event count: 5 161
     * Trace length: 11s
     * </pre>
     */
    CYG_PROFILE_FAST("/cyg-profile/glxgears-cyg-profile-fast", 5161, 11),

    /** Trace with non-standard field sizes */
    FUNKY_TRACE("/funky_trace", 100002, 0),

    /**
     * Kernel Trace with 64 bit aligned headers
     *
     * <pre>
     * Trace Size: 1.1 MB
     * Tracer: lttng-kernel 2.5
     * Event count: 31 556
     * Trace length: 6 s
     * </pre>
     */
    ARM_64_BIT_HEADER("/bug446190", 31556, 6),

    /**
     * Kernel Trace with flipping endianness
     *
     * <pre>
     * Trace Size: 327 KB
     * Tracer: lttng-kernel 2.5
     * Event count: 14 310
     * Trace length: 41 s
     * </pre>
     */
    FLIPPING_ENDIANNESS("/flipping-endianness", 14310, 41),

    /**
     * Example dynamic scope, timestamp in field, empty stream trace
     *
     * <pre>
     * Trace Size: 3.5 MB
     * Tracer: generated
     * Event count: 101 003
     * Kernel version: 4.0.6-1
     * Trace length: 1 ms
     * </pre>
     */
    DYNSCOPE("/ctfwriter_JF8nq3", 101003, 1),

    /** Set of many traces, do not call getTrace */
    TRACE_EXPERIMENT("/exp", -1, -1),

    /**
     * UST Trace with Debug Info information
     *
     * <pre>
     * Trace Size: 76 KB (including index/)
     * Tracer: lttng-ust 2.8
     * Event count: 41
     * Trace length: ~1 s
     * </pre>
     */
    DEBUG_INFO("/debuginfo-test-app2", 41, 1),

    /**
     * UST Trace with Memory analysis information
     *
     * <pre>
     * Trace Size: 12 MB
     * Tracer: lttng-ust 2.7
     * Event count: 328056
     * Trace length: ~0.53 s
     * </pre>
     */
    MEMORY_ANALYSIS("/memory", 328056, 1),

    /**
     * CTF trace coming from the perf-CTF converter.
     *
     * CPUs are not defined by standard "cpu_id" CTF data, but by event fields
     * called "perf_cpu".
     *
     * <pre>
     * Trace Size: 196 KB
     * Tracer: perf
     * Event count: 1500
     * Trace length: 0.417057183 s
     * </pre>
     */
    PERF_TASKSET2("/perf-taskset2", 1500, 1);

    private final String fTraceName;
    private final int fNbEvent;
    private int fDuration;

    private CtfTestTrace(String traceName, int nbEvent, int time) {
        fTraceName = traceName;
        fNbEvent = nbEvent;
        fDuration = time;
    }

    public URL getTraceURL() {
        URL url = this.getClass().getResource(fTraceName);
        if (url == null) {
            /* Project configuration problem? */
            throw new IllegalStateException("Test trace not found");
        }
        return url;
    }

    /**
     * Get the number of events for a trace
     *
     * @return the number of events, -1 if irrelevant
     */
    public int getNbEvents() {
        return fNbEvent;
    }

    /**
     * Get the duration in seconds of a trace
     *
     * @return the duration in seconds of a trace, -1 if irrelevant
     */
    public int getDuration() {
        return fDuration;
    }
}
