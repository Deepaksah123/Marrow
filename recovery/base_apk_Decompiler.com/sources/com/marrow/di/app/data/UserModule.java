package com.marrow.di.app.data;

import android.app.Application;
import com.marrow.data.models.common.ApplicationData;
import kotlin.Cea608DecoderCueBuilderCueStyle;
import kotlin.GTNudgeRequestModel;
import kotlin.LoaderLoadable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RtspMessageChannelSender;
import kotlin.TrackGroupExternalSyntheticLambda0;
import kotlin.computePeriodTimeOffsets;
import kotlin.getContentDataSource;
import kotlin.getMagicModuleMeta;
import kotlin.getNextChunkIndex;
import kotlin.getPlanOldPrice;
import kotlin.getRepresentations;
import kotlin.getStreamPositionUsForContent;
import kotlin.getTrackOutputProvider;
import kotlin.handleG2Character;
import kotlin.handleInterleavedBinaryData;
import kotlin.parseMediaPlaylist;
import kotlin.parseOptionalDoubleAttr;
import kotlin.parseOptionalIntAttr;
import kotlin.rollUp;
import kotlin.setGateway;
import kotlin.setTreatLoadErrorsAsEndOfStream;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0007\u0010\u0011J?\u0010\n\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\n\u0010\u001bJ7\u0010\n\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\n\u0010\u001eJ?\u0010\u0007\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020 H\u0007¢\u0006\u0004\b\u0007\u0010\"J\u0017\u0010\r\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010#"}, d2 = {"Lcom/marrow/di/app/data/UserModule;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/computePeriodTimeOffsets;", "RemoteActionCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/computePeriodTimeOffsets;", "Lo/TrackGroupExternalSyntheticLambda0;", "IconCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/TrackGroupExternalSyntheticLambda0;", "Lo/handleG2Character;", "write", "(Lo/GTNudgeRequestModel;)Lo/handleG2Character;", "Landroid/app/Application;", "Lo/LoaderLoadable;", "(Landroid/app/Application;)Lo/LoaderLoadable;", "Lcom/marrow/data/models/common/ApplicationData;", "p1", "p2", "p3", "Lo/getStreamPositionUsForContent;", "p4", "Lo/getNextChunkIndex;", "p5", "Lo/parseOptionalIntAttr;", "(Landroid/app/Application;Lcom/marrow/data/models/common/ApplicationData;Lo/computePeriodTimeOffsets;Lo/TrackGroupExternalSyntheticLambda0;Lo/getStreamPositionUsForContent;Lo/getNextChunkIndex;)Lo/parseOptionalIntAttr;", "Lo/setTreatLoadErrorsAsEndOfStream;", "Lo/getRepresentations;", "(Lo/setTreatLoadErrorsAsEndOfStream;Lcom/marrow/data/models/common/ApplicationData;Lo/TrackGroupExternalSyntheticLambda0;Lo/getRepresentations;Lo/getStreamPositionUsForContent;)Lo/getNextChunkIndex;", "Lo/getContentDataSource;", "Lo/handleInterleavedBinaryData;", "Lo/Cea608DecoderCueBuilderCueStyle;", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;Lo/handleG2Character;Lo/LoaderLoadable;Lo/getContentDataSource;Lo/handleInterleavedBinaryData;)Lo/Cea608DecoderCueBuilderCueStyle;", "(Landroid/app/Application;)Lo/handleInterleavedBinaryData;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public final computePeriodTimeOffsets RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) computePeriodTimeOffsets.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (computePeriodTimeOffsets) obj;
    }

    @getPlanOldPrice
    public final TrackGroupExternalSyntheticLambda0 IconCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) TrackGroupExternalSyntheticLambda0.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (TrackGroupExternalSyntheticLambda0) obj;
    }

    @getPlanOldPrice
    public final handleG2Character write(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = p0.read((Class<Object>) handleG2Character.class);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        return (handleG2Character) obj;
    }

    @getPlanOldPrice
    public final LoaderLoadable RemoteActionCompatParcelizer(Application p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LoaderLoadable.Companion companion = LoaderLoadable.INSTANCE;
        return LoaderLoadable.Companion.AudioAttributesCompatParcelizer(p0);
    }

    @getPlanOldPrice
    public final parseOptionalIntAttr IconCompatParcelizer(Application p0, ApplicationData p1, computePeriodTimeOffsets p2, TrackGroupExternalSyntheticLambda0 p3, getStreamPositionUsForContent p4, getNextChunkIndex p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new parseOptionalDoubleAttr(p0, p1, p2, p3, p4, p5);
    }

    @getPlanOldPrice
    public final getNextChunkIndex IconCompatParcelizer(setTreatLoadErrorsAsEndOfStream p0, ApplicationData p1, TrackGroupExternalSyntheticLambda0 p2, getRepresentations p3, getStreamPositionUsForContent p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new parseMediaPlaylist(p0, p2, p1, p3, p4);
    }

    @getPlanOldPrice
    public final Cea608DecoderCueBuilderCueStyle RemoteActionCompatParcelizer(Application p0, getStreamPositionUsForContent p1, handleG2Character p2, LoaderLoadable p3, getContentDataSource p4, handleInterleavedBinaryData p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new rollUp(p0, p1, p2, p3, p4, p5);
    }

    @getPlanOldPrice
    public final handleInterleavedBinaryData write(Application p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new RtspMessageChannelSender(p0);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.UserModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/marrow/di/app/data/UserModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setTreatLoadErrorsAsEndOfStream;", "p0", "Lcom/marrow/data/models/common/ApplicationData;", "p1", "Lo/TrackGroupExternalSyntheticLambda0;", "p2", "Lo/getStreamPositionUsForContent;", "p3", "Lo/getRepresentations;", "p4", "Lo/getNextChunkIndex;", "read", "(Lo/setTreatLoadErrorsAsEndOfStream;Lcom/marrow/data/models/common/ApplicationData;Lo/TrackGroupExternalSyntheticLambda0;Lo/getStreamPositionUsForContent;Lo/getRepresentations;)Lo/getNextChunkIndex;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getNextChunkIndex read(setTreatLoadErrorsAsEndOfStream p0, ApplicationData p1, TrackGroupExternalSyntheticLambda0 p2, getStreamPositionUsForContent p3, getRepresentations p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            return new getTrackOutputProvider(p0, p2, p1, p3, p4);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getNextChunkIndex read(setTreatLoadErrorsAsEndOfStream settreatloaderrorsasendofstream, ApplicationData applicationData, TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0, getStreamPositionUsForContent getstreampositionusforcontent, getRepresentations getrepresentations) {
        return INSTANCE.read(settreatloaderrorsasendofstream, applicationData, trackGroupExternalSyntheticLambda0, getstreampositionusforcontent, getrepresentations);
    }
}
