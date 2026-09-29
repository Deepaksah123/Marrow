package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.initExtraTracks;
import kotlin.parseMdtaFromMeta;
import kotlin.parseTextAttribute;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspMessageChannel implements Closeable {
    public static final Charset CHARSET = parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
    public static final int DEFAULT_RTSP_PORT = 554;
    private static final String TAG = "RtspMessageChannel";
    private volatile boolean closed;
    private final MessageListener messageListener;
    private Sender sender;
    private Socket socket;
    private final Loader receiverLoader = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    private final Map<Integer, InterleavedBinaryDataListener> interleavedBinaryDataListeners = Collections.synchronizedMap(new HashMap());

    public interface InterleavedBinaryDataListener {
        void onInterleavedBinaryDataReceived(byte[] bArr);
    }

    public interface MessageListener {
        default void onReceivingFailed(Exception exc) {
        }

        void onRtspMessageReceived(List<String> list);

        default void onSendingFailed(List<String> list, Exception exc) {
        }
    }

    public RtspMessageChannel(MessageListener messageListener) {
        this.messageListener = messageListener;
    }

    public final void open(Socket socket) throws IOException {
        this.socket = socket;
        this.sender = new Sender(socket.getOutputStream());
        this.receiverLoader.startLoading(new Receiver(socket.getInputStream()), new LoaderCallbackImpl(), 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            Sender sender = this.sender;
            if (sender != null) {
                sender.close();
            }
            this.receiverLoader.release();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.closed = true;
        }
    }

    public final void send(List<String> list) {
        Assertions.checkStateNotNull(this.sender);
        this.sender.send(list);
    }

    public final void registerInterleavedBinaryDataListener(int i, InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.interleavedBinaryDataListeners.put(Integer.valueOf(i), interleavedBinaryDataListener);
    }

    final class Sender implements Closeable {
        private final OutputStream outputStream;
        private final HandlerThread senderThread;
        private final Handler senderThreadHandler;

        public Sender(OutputStream outputStream) {
            this.outputStream = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.senderThread = handlerThread;
            handlerThread.start();
            this.senderThreadHandler = new Handler(handlerThread.getLooper());
        }

        public final void send(final List<String> list) {
            final byte[] bArrConvertMessageToByteArray = RtspMessageUtil.convertMessageToByteArray(list);
            this.senderThreadHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMessageChannel$Sender$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m129lambda$send$0$comgoogleandroidexoplayer2sourcertspRtspMessageChannel$Sender(bArrConvertMessageToByteArray, list);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$send$0$com-google-android-exoplayer2-source-rtsp-RtspMessageChannel$Sender, reason: not valid java name */
        final /* synthetic */ void m129lambda$send$0$comgoogleandroidexoplayer2sourcertspRtspMessageChannel$Sender(byte[] bArr, List list) {
            try {
                this.outputStream.write(bArr);
            } catch (Exception e) {
                if (RtspMessageChannel.this.closed) {
                    return;
                }
                RtspMessageChannel.this.messageListener.onSendingFailed(list, e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Handler handler = this.senderThreadHandler;
            final HandlerThread handlerThread = this.senderThread;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMessageChannel$Sender$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.senderThread.join();
            } catch (InterruptedException unused) {
                this.senderThread.interrupt();
            }
        }
    }

    final class Receiver implements Loader.Loadable {
        private static final byte INTERLEAVED_MESSAGE_MARKER = 36;
        private final DataInputStream dataInputStream;
        private volatile boolean loadCanceled;
        private final MessageParser messageParser = new MessageParser();

        public Receiver(InputStream inputStream) {
            this.dataInputStream = new DataInputStream(inputStream);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void load() throws IOException {
            while (!this.loadCanceled) {
                byte b = this.dataInputStream.readByte();
                if (b == 36) {
                    handleInterleavedBinaryData();
                } else {
                    handleRtspMessage(b);
                }
            }
        }

        private void handleRtspMessage(byte b) throws IOException {
            if (RtspMessageChannel.this.closed) {
                return;
            }
            RtspMessageChannel.this.messageListener.onRtspMessageReceived(this.messageParser.parseNext(b, this.dataInputStream));
        }

        private void handleInterleavedBinaryData() throws IOException {
            int unsignedByte = this.dataInputStream.readUnsignedByte();
            int unsignedShort = this.dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.dataInputStream.readFully(bArr, 0, unsignedShort);
            InterleavedBinaryDataListener interleavedBinaryDataListener = (InterleavedBinaryDataListener) RtspMessageChannel.this.interleavedBinaryDataListeners.get(Integer.valueOf(unsignedByte));
            if (interleavedBinaryDataListener == null || RtspMessageChannel.this.closed) {
                return;
            }
            interleavedBinaryDataListener.onInterleavedBinaryDataReceived(bArr);
        }
    }

    final class LoaderCallbackImpl implements Loader.Callback<Receiver> {
        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public final void onLoadCanceled(Receiver receiver, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public final void onLoadCompleted(Receiver receiver, long j, long j2) {
        }

        private LoaderCallbackImpl() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public final Loader.LoadErrorAction onLoadError(Receiver receiver, long j, long j2, IOException iOException, int i) {
            if (!RtspMessageChannel.this.closed) {
                RtspMessageChannel.this.messageListener.onReceivingFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }
    }

    static final class MessageParser {
        private static final int STATE_READING_BODY = 3;
        private static final int STATE_READING_FIRST_LINE = 1;
        private static final int STATE_READING_HEADER = 2;
        private long messageBodyLength;
        private final List<String> messageLines = new ArrayList();
        private int state = 1;

        public final initExtraTracks<String> parseNext(byte b, DataInputStream dataInputStream) throws IOException {
            initExtraTracks<String> initextratracksAddMessageLine = addMessageLine(parseNextLine(b, dataInputStream));
            while (initextratracksAddMessageLine == null) {
                if (this.state == 3) {
                    long j = this.messageBodyLength;
                    if (j > 0) {
                        int iRemoteActionCompatParcelizer = parseTextAttribute.RemoteActionCompatParcelizer(j);
                        Assertions.checkState(iRemoteActionCompatParcelizer != -1);
                        byte[] bArr = new byte[iRemoteActionCompatParcelizer];
                        dataInputStream.readFully(bArr, 0, iRemoteActionCompatParcelizer);
                        initextratracksAddMessageLine = addMessageBody(bArr);
                    } else {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                } else {
                    initextratracksAddMessageLine = addMessageLine(parseNextLine(dataInputStream.readByte(), dataInputStream));
                }
            }
            return initextratracksAddMessageLine;
        }

        private static byte[] parseNextLine(byte b, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] != 13 || bArr[1] != 10) {
                    bArr[0] = bArr[1];
                    byte b2 = dataInputStream.readByte();
                    bArr[1] = b2;
                    byteArrayOutputStream.write(b2);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        private initExtraTracks<String> addMessageLine(byte[] bArr) throws ParserException {
            Assertions.checkArgument(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, RtspMessageChannel.CHARSET);
            this.messageLines.add(str);
            int i = this.state;
            if (i == 1) {
                if (!RtspMessageUtil.isRtspStartLine(str)) {
                    return null;
                }
                this.state = 2;
                return null;
            }
            if (i == 2) {
                long contentLengthHeader = RtspMessageUtil.parseContentLengthHeader(str);
                if (contentLengthHeader != -1) {
                    this.messageBodyLength = contentLengthHeader;
                }
                if (!str.isEmpty()) {
                    return null;
                }
                if (this.messageBodyLength > 0) {
                    this.state = 3;
                    return null;
                }
                initExtraTracks<String> initextratracksWrite = initExtraTracks.write(this.messageLines);
                reset();
                return initextratracksWrite;
            }
            throw new IllegalStateException();
        }

        private initExtraTracks<String> addMessageBody(byte[] bArr) {
            String str;
            Assertions.checkState(this.state == 3);
            if (bArr.length > 0 && bArr[bArr.length - 1] == 10) {
                if (bArr.length > 1 && bArr[bArr.length - 2] == 13) {
                    str = new String(bArr, 0, bArr.length - 2, RtspMessageChannel.CHARSET);
                } else {
                    str = new String(bArr, 0, bArr.length - 1, RtspMessageChannel.CHARSET);
                }
                this.messageLines.add(str);
                initExtraTracks<String> initextratracksWrite = initExtraTracks.write(this.messageLines);
                reset();
                return initextratracksWrite;
            }
            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
        }

        private void reset() {
            this.messageLines.clear();
            this.state = 1;
            this.messageBodyLength = 0L;
        }
    }
}
