package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C;
import kotlin.CAudioAllowedCapturePolicy;
import kotlin.CAudioFlags;
import kotlin.CColorRange;
import kotlin.CColorSpace;
import kotlin.CColorTransfer;
import kotlin.CCryptoMode;
import kotlin.CFormatSupport;
import kotlin.CRoleFlags;
import kotlin.CSelectionReason;
import kotlin.CStreamType;
import kotlin.CVolumeFlags;
import kotlin.CWakeMode;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.RenewEligible;
import kotlin.ValueClassUnboxSerializer;
import kotlin.addMediaItem;
import kotlin.addMediaItems;
import kotlin.canAdvertiseSession;
import kotlin.deserializeKeyQDdqvc;
import kotlin.fromBundle;
import kotlin.getContentDuration;
import kotlin.getCreatedOnDateMs;
import kotlin.getRenewExpiresOn;
import kotlin.getRepeatModeForNavigation;
import kotlin.isHdPlaybackError;
import kotlin.repeatCurrentMediaItem;
import kotlin.seekToCurrentItem;
import kotlin.seekToOffset;
import kotlin.seekToPreviousMediaItemInternal;
import kotlin.setBufferDurationsMs;
import kotlin.setDrawCenterText;
import kotlin.setDrawHoleEnabled;
import kotlin.setExtraBottomOffset;
import kotlin.setNoDataTextTypeface;
import kotlin.setVisibleXRangeMaximum;
import kotlin.setVisibleYRange;
import kotlin.shouldStartPlayback;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010."}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Lo/ValueClassUnboxSerializer;", "onPrepareFromSearch", "()Lo/ValueClassUnboxSerializer;", "Lo/deserializeKeyQDdqvc;", "AudioAttributesCompatParcelizer", "()Lo/deserializeKeyQDdqvc;", "", "Lo/isHdPlaybackError;", "", "MediaMetadataCompat", "()Ljava/util/Map;", "", "Lo/setVisibleXRangeMaximum;", "RatingCompat", "()Ljava/util/Set;", "p0", "Lo/setVisibleYRange;", "write", "(Ljava/util/Map;)Ljava/util/List;", "Lo/CVolumeFlags;", "onMediaButtonEvent", "()Lo/CVolumeFlags;", "Lo/fromBundle;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/fromBundle;", "Lo/shouldStartPlayback;", "onPrepareFromMediaId", "()Lo/shouldStartPlayback;", "Lo/CColorRange;", "onPause", "()Lo/CColorRange;", "Lo/CRoleFlags;", "onFastForward", "()Lo/CRoleFlags;", "Lo/CStreamType;", "onPlayFromMediaId", "()Lo/CStreamType;", "Lo/CAudioFlags;", "onPlay", "()Lo/CAudioFlags;", "Lo/RenewEligible;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/RenewEligible;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/CColorTransfer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible<CVolumeFlags> IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getCurrentLiveOffset
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.MediaBrowserCompatSearchResultReceiver(this.IconCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible<fromBundle> write = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.clearMediaItems
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible<shouldStartPlayback> read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getCurrentManifest
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.onAddQueueItem(this.RemoteActionCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final RenewEligible<CColorRange> AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getBufferedPercentage
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.MediaBrowserCompatMediaItem(this.read);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible<CRoleFlags> RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getMediaItemAt
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.MediaMetadataCompat(this.IconCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final RenewEligible<CStreamType> AudioAttributesImplBaseParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getCurrentMediaItem
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.MediaDescriptionCompat(this.IconCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible<CAudioFlags> MediaBrowserCompatCustomActionResultReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getMediaItemCount
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible<CColorTransfer> AudioAttributesImplApi21Parcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getNextMediaItemIndex
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return WorkDatabase_Impl.RatingCompat(this.IconCompatParcelizer);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final CWakeMode MediaBrowserCompatSearchResultReceiver(WorkDatabase_Impl workDatabase_Impl) {
        return new CWakeMode(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C AudioAttributesImplApi26Parcelizer(WorkDatabase_Impl workDatabase_Impl) {
        return new C(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setBufferDurationsMs onAddQueueItem(WorkDatabase_Impl workDatabase_Impl) {
        return new setBufferDurationsMs(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CCryptoMode MediaBrowserCompatMediaItem(WorkDatabase_Impl workDatabase_Impl) {
        return new CCryptoMode(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CFormatSupport MediaMetadataCompat(WorkDatabase_Impl workDatabase_Impl) {
        return new CFormatSupport(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CSelectionReason MediaDescriptionCompat(WorkDatabase_Impl workDatabase_Impl) {
        return new CSelectionReason(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CAudioAllowedCapturePolicy AudioAttributesImplApi21Parcelizer(WorkDatabase_Impl workDatabase_Impl) {
        return new CAudioAllowedCapturePolicy(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CColorSpace RatingCompat(WorkDatabase_Impl workDatabase_Impl) {
        return new CColorSpace(workDatabase_Impl);
    }

    public static final class write extends ValueClassUnboxSerializer {
        write() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void write(setDrawHoleEnabled setdrawholeenabled) throws Exception {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            setDrawCenterText.read(setdrawholeenabled, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            setDrawCenterText.read(setdrawholeenabled, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            setDrawCenterText.read(setdrawholeenabled, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void read(setDrawHoleEnabled setdrawholeenabled) throws Exception {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `Dependency`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `WorkSpec`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `WorkTag`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `SystemIdInfo`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `WorkName`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `WorkProgress`");
            setDrawCenterText.read(setdrawholeenabled, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) throws Exception {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            setDrawCenterText.read(setdrawholeenabled, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.RemoteActionCompatParcelizer(setdrawholeenabled);
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void AudioAttributesImplApi26Parcelizer(setDrawHoleEnabled setdrawholeenabled) throws Exception {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            setExtraBottomOffset.write(setdrawholeenabled);
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final ValueClassUnboxSerializer.IconCompatParcelizer AudioAttributesImplApi21Parcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new setNoDataTextTypeface.write("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new setNoDataTextTypeface.write("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            linkedHashSet.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("prerequisite_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new setNoDataTextTypeface.IconCompatParcelizer("index_Dependency_work_spec_id", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            linkedHashSet2.add(new setNoDataTextTypeface.IconCompatParcelizer("index_Dependency_prerequisite_id", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("prerequisite_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            setNoDataTextTypeface setnodatatexttypeface = new setNoDataTextTypeface("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            setNoDataTextTypeface.Companion companion = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "Dependency");
            if (!setnodatatexttypeface.equals(setnodatatexttypefaceWrite)) {
                StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                sb.append(setnodatatexttypeface);
                sb.append("\n Found:\n");
                sb.append(setnodatatexttypefaceWrite);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb.toString());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new setNoDataTextTypeface.write("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put(NotesDispatchAddressRequestKt.KEY_STATE, new setNoDataTextTypeface.write(NotesDispatchAddressRequestKt.KEY_STATE, "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new setNoDataTextTypeface.write("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new setNoDataTextTypeface.write("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new setNoDataTextTypeface.write("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new setNoDataTextTypeface.write("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new setNoDataTextTypeface.write("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new setNoDataTextTypeface.write("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new setNoDataTextTypeface.write("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new setNoDataTextTypeface.write("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new setNoDataTextTypeface.write("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new setNoDataTextTypeface.write("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new setNoDataTextTypeface.write("last_enqueue_time", "INTEGER", true, 0, TestIndex.ALL_INDIA_ID, 1));
            linkedHashMap2.put("minimum_retention_duration", new setNoDataTextTypeface.write("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new setNoDataTextTypeface.write("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new setNoDataTextTypeface.write("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new setNoDataTextTypeface.write("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new setNoDataTextTypeface.write("period_count", "INTEGER", true, 0, SessionDescription.SUPPORTED_SDP_VERSION, 1));
            linkedHashMap2.put("generation", new setNoDataTextTypeface.write("generation", "INTEGER", true, 0, SessionDescription.SUPPORTED_SDP_VERSION, 1));
            linkedHashMap2.put("next_schedule_time_override", new setNoDataTextTypeface.write("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new setNoDataTextTypeface.write("next_schedule_time_override_generation", "INTEGER", true, 0, SessionDescription.SUPPORTED_SDP_VERSION, 1));
            linkedHashMap2.put(DownloadService.KEY_STOP_REASON, new setNoDataTextTypeface.write(DownloadService.KEY_STOP_REASON, "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new setNoDataTextTypeface.write("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new setNoDataTextTypeface.write("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new setNoDataTextTypeface.write("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new setNoDataTextTypeface.write("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new setNoDataTextTypeface.write("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new setNoDataTextTypeface.write("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new setNoDataTextTypeface.write("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new setNoDataTextTypeface.write("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new setNoDataTextTypeface.write("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new setNoDataTextTypeface.write("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new setNoDataTextTypeface.write("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new setNoDataTextTypeface.IconCompatParcelizer("index_WorkSpec_schedule_requested_at", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("schedule_requested_at"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            linkedHashSet4.add(new setNoDataTextTypeface.IconCompatParcelizer("index_WorkSpec_last_enqueue_time", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("last_enqueue_time"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            setNoDataTextTypeface setnodatatexttypeface2 = new setNoDataTextTypeface("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            setNoDataTextTypeface.Companion companion2 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite2 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "WorkSpec");
            if (!setnodatatexttypeface2.equals(setnodatatexttypefaceWrite2)) {
                StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                sb2.append(setnodatatexttypeface2);
                sb2.append("\n Found:\n");
                sb2.append(setnodatatexttypefaceWrite2);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb2.toString());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new setNoDataTextTypeface.write("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new setNoDataTextTypeface.write("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new setNoDataTextTypeface.IconCompatParcelizer("index_WorkTag_work_spec_id", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            setNoDataTextTypeface setnodatatexttypeface3 = new setNoDataTextTypeface("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            setNoDataTextTypeface.Companion companion3 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite3 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "WorkTag");
            if (!setnodatatexttypeface3.equals(setnodatatexttypefaceWrite3)) {
                StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                sb3.append(setnodatatexttypeface3);
                sb3.append("\n Found:\n");
                sb3.append(setnodatatexttypefaceWrite3);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb3.toString());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new setNoDataTextTypeface.write("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new setNoDataTextTypeface.write("generation", "INTEGER", true, 2, SessionDescription.SUPPORTED_SDP_VERSION, 1));
            linkedHashMap4.put("system_id", new setNoDataTextTypeface.write("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            setNoDataTextTypeface setnodatatexttypeface4 = new setNoDataTextTypeface("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            setNoDataTextTypeface.Companion companion4 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite4 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "SystemIdInfo");
            if (!setnodatatexttypeface4.equals(setnodatatexttypefaceWrite4)) {
                StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                sb4.append(setnodatatexttypeface4);
                sb4.append("\n Found:\n");
                sb4.append(setnodatatexttypefaceWrite4);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb4.toString());
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new setNoDataTextTypeface.write("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new setNoDataTextTypeface.write("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new setNoDataTextTypeface.IconCompatParcelizer("index_WorkName_work_spec_id", false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("ASC")));
            setNoDataTextTypeface setnodatatexttypeface5 = new setNoDataTextTypeface("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            setNoDataTextTypeface.Companion companion5 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite5 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "WorkName");
            if (!setnodatatexttypeface5.equals(setnodatatexttypefaceWrite5)) {
                StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                sb5.append(setnodatatexttypeface5);
                sb5.append("\n Found:\n");
                sb5.append(setnodatatexttypefaceWrite5);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb5.toString());
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new setNoDataTextTypeface.write("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put("progress", new setNoDataTextTypeface.write("progress", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new setNoDataTextTypeface.AudioAttributesCompatParcelizer("WorkSpec", "CASCADE", "CASCADE", IntermediateLoginResponseBody.RemoteActionCompatParcelizer("work_spec_id"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer("id")));
            setNoDataTextTypeface setnodatatexttypeface6 = new setNoDataTextTypeface("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            setNoDataTextTypeface.Companion companion6 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite6 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "WorkProgress");
            if (!setnodatatexttypeface6.equals(setnodatatexttypefaceWrite6)) {
                StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                sb6.append(setnodatatexttypeface6);
                sb6.append("\n Found:\n");
                sb6.append(setnodatatexttypefaceWrite6);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb6.toString());
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("key", new setNoDataTextTypeface.write("key", "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new setNoDataTextTypeface.write("long_value", "INTEGER", false, 0, null, 1));
            setNoDataTextTypeface setnodatatexttypeface7 = new setNoDataTextTypeface("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            setNoDataTextTypeface.Companion companion7 = setNoDataTextTypeface.INSTANCE;
            setNoDataTextTypeface setnodatatexttypefaceWrite7 = setNoDataTextTypeface.Companion.write(setdrawholeenabled, "Preference");
            if (!setnodatatexttypeface7.equals(setnodatatexttypefaceWrite7)) {
                StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                sb7.append(setnodatatexttypeface7);
                sb7.append("\n Found:\n");
                sb7.append(setnodatatexttypefaceWrite7);
                return new ValueClassUnboxSerializer.IconCompatParcelizer(false, sb7.toString());
            }
            return new ValueClassUnboxSerializer.IconCompatParcelizer(true, null);
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void IconCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ValueClassSerializerStaticJsonValue
    /* JADX INFO: renamed from: onPrepareFromSearch, reason: merged with bridge method [inline-methods] */
    public ValueClassUnboxSerializer write() {
        return new write();
    }

    @Override // kotlin.ValueClassSerializerStaticJsonValue
    public final deserializeKeyQDdqvc AudioAttributesCompatParcelizer() {
        return new deserializeKeyQDdqvc(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // kotlin.ValueClassSerializerStaticJsonValue
    public final Map<isHdPlaybackError<?>, List<isHdPlaybackError<?>>> MediaMetadataCompat() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        isHdPlaybackError ishdplaybackerrorWrite = toMagicModuleMetaDataUcModel.write(CVolumeFlags.class);
        CWakeMode.Companion companion = CWakeMode.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite, CWakeMode.Companion.RemoteActionCompatParcelizer());
        isHdPlaybackError ishdplaybackerrorWrite2 = toMagicModuleMetaDataUcModel.write(fromBundle.class);
        C.Companion companion2 = C.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite2, C.Companion.write());
        isHdPlaybackError ishdplaybackerrorWrite3 = toMagicModuleMetaDataUcModel.write(shouldStartPlayback.class);
        setBufferDurationsMs.Companion companion3 = setBufferDurationsMs.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite3, setBufferDurationsMs.Companion.AudioAttributesCompatParcelizer());
        isHdPlaybackError ishdplaybackerrorWrite4 = toMagicModuleMetaDataUcModel.write(CColorRange.class);
        CCryptoMode.Companion companion4 = CCryptoMode.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite4, CCryptoMode.Companion.read());
        isHdPlaybackError ishdplaybackerrorWrite5 = toMagicModuleMetaDataUcModel.write(CRoleFlags.class);
        CFormatSupport.Companion companion5 = CFormatSupport.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite5, CFormatSupport.Companion.IconCompatParcelizer());
        isHdPlaybackError ishdplaybackerrorWrite6 = toMagicModuleMetaDataUcModel.write(CStreamType.class);
        CSelectionReason.Companion companion6 = CSelectionReason.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite6, CSelectionReason.Companion.IconCompatParcelizer());
        isHdPlaybackError ishdplaybackerrorWrite7 = toMagicModuleMetaDataUcModel.write(CAudioFlags.class);
        CAudioAllowedCapturePolicy.Companion companion7 = CAudioAllowedCapturePolicy.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite7, CAudioAllowedCapturePolicy.Companion.IconCompatParcelizer());
        isHdPlaybackError ishdplaybackerrorWrite8 = toMagicModuleMetaDataUcModel.write(CColorTransfer.class);
        CColorSpace.Companion companion8 = CColorSpace.INSTANCE;
        linkedHashMap.put(ishdplaybackerrorWrite8, CColorSpace.Companion.RemoteActionCompatParcelizer());
        return linkedHashMap;
    }

    @Override // kotlin.ValueClassSerializerStaticJsonValue
    public final Set<isHdPlaybackError<? extends setVisibleXRangeMaximum>> RatingCompat() {
        return new LinkedHashSet();
    }

    @Override // kotlin.ValueClassSerializerStaticJsonValue
    public final List<setVisibleYRange> write(Map<isHdPlaybackError<? extends setVisibleXRangeMaximum>, ? extends setVisibleXRangeMaximum> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new repeatCurrentMediaItem());
        arrayList.add(new getRepeatModeForNavigation());
        arrayList.add(new seekToCurrentItem());
        arrayList.add(new addMediaItems());
        arrayList.add(new seekToPreviousMediaItemInternal());
        arrayList.add(new canAdvertiseSession());
        arrayList.add(new seekToOffset());
        arrayList.add(new addMediaItem());
        arrayList.add(new getContentDuration());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CVolumeFlags onMediaButtonEvent() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fromBundle MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final shouldStartPlayback onPrepareFromMediaId() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CColorRange onPause() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CRoleFlags onFastForward() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CStreamType onPlayFromMediaId() {
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final CAudioFlags onPlay() {
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
    }
}
