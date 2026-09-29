package kotlin;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TrackSampleTable;
import kotlin.onFlushCompleted;

/* JADX INFO: loaded from: classes.dex */
public final class buildUserDataReader {
    private volatile onStartCode AudioAttributesCompatParcelizer;
    private final onFlushCompleted<TrackSampleTable> IconCompatParcelizer;
    private final List<H264Reader> read;
    private volatile nalUnitData write;

    public buildUserDataReader(onFlushCompleted<TrackSampleTable> onflushcompleted) {
        this(onflushcompleted, new H263ReaderSampleReader(), new endNalUnit());
    }

    private buildUserDataReader(onFlushCompleted<TrackSampleTable> onflushcompleted, nalUnitData nalunitdata, onStartCode onstartcode) {
        this.IconCompatParcelizer = onflushcompleted;
        this.write = nalunitdata;
        this.read = new ArrayList();
        this.AudioAttributesCompatParcelizer = onstartcode;
        IconCompatParcelizer();
    }

    public final nalUnitData AudioAttributesCompatParcelizer() {
        return new nalUnitData() { // from class: o.getSampleDurationUs
            @Override // kotlin.nalUnitData
            public final void RemoteActionCompatParcelizer(H264Reader h264Reader) {
                this.AudioAttributesCompatParcelizer.read(h264Reader);
            }
        };
    }

    final /* synthetic */ void read(H264Reader h264Reader) {
        synchronized (this) {
            if (this.write instanceof H263ReaderSampleReader) {
                this.read.add(h264Reader);
            }
            this.write.RemoteActionCompatParcelizer(h264Reader);
        }
    }

    public final onStartCode RemoteActionCompatParcelizer() {
        return new onStartCode() { // from class: o.DefaultTsPayloadReaderFactory
            @Override // kotlin.onStartCode
            public final void write(String str, Bundle bundle) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, bundle);
            }
        };
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(String str, Bundle bundle) {
        this.AudioAttributesCompatParcelizer.write(str, bundle);
    }

    private void IconCompatParcelizer() {
        this.IconCompatParcelizer.write(new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.getClosedCaptionFormats
            @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
            public final void read(onInputBufferAvailable oninputbufferavailable) {
                this.read.RemoteActionCompatParcelizer(oninputbufferavailable);
            }
        });
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(onInputBufferAvailable oninputbufferavailable) {
        DvbSubtitleReader.read().IconCompatParcelizer("AnalyticsConnector now available.");
        TrackSampleTable trackSampleTable = (TrackSampleTable) oninputbufferavailable.write();
        H263Reader h263Reader = new H263Reader(trackSampleTable);
        createInitialPayloadReaders createinitialpayloadreaders = new createInitialPayloadReaders();
        if (RemoteActionCompatParcelizer(trackSampleTable, createinitialpayloadreaders) != null) {
            DvbSubtitleReader.read().IconCompatParcelizer("Registered Firebase Analytics listener.");
            H263ReaderCsdBuffer h263ReaderCsdBuffer = new H263ReaderCsdBuffer();
            H262ReaderCsdBuffer h262ReaderCsdBuffer = new H262ReaderCsdBuffer(h263Reader, TimeUnit.MILLISECONDS);
            synchronized (this) {
                Iterator<H264Reader> it = this.read.iterator();
                while (it.hasNext()) {
                    h263ReaderCsdBuffer.RemoteActionCompatParcelizer(it.next());
                }
                createinitialpayloadreaders.read(h263ReaderCsdBuffer);
                createinitialpayloadreaders.AudioAttributesCompatParcelizer(h262ReaderCsdBuffer);
                this.write = h263ReaderCsdBuffer;
                this.AudioAttributesCompatParcelizer = h262ReaderCsdBuffer;
            }
            return;
        }
        DvbSubtitleReader.read().read("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static TrackSampleTable.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(TrackSampleTable trackSampleTable, createInitialPayloadReaders createinitialpayloadreaders) {
        TrackSampleTable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = trackSampleTable.write("clx", createinitialpayloadreaders);
        if (audioAttributesCompatParcelizerWrite != null) {
            return audioAttributesCompatParcelizerWrite;
        }
        DvbSubtitleReader.read().IconCompatParcelizer("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        TrackSampleTable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite2 = trackSampleTable.write(AppMeasurement.CRASH_ORIGIN, createinitialpayloadreaders);
        if (audioAttributesCompatParcelizerWrite2 != null) {
            DvbSubtitleReader.read().read("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return audioAttributesCompatParcelizerWrite2;
    }
}
