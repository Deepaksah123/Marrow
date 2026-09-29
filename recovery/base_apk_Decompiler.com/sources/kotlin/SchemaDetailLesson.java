package kotlin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.McqContentBody;
import kotlin.setActiveRecallQbankId;
import kotlin.setOption6AnsweredCount;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SchemaDetailLesson extends setStatusUpdateEndTimeMs {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(SchemaDetailLesson.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(SchemaDetailLesson.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    private final PageValue AudioAttributesCompatParcelizer;
    private final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final SchemaLessonStatusResponse RemoteActionCompatParcelizer;
    private final McqTimeSpent write;

    interface RemoteActionCompatParcelizer {
        Set<getRelatedLessonId> AudioAttributesCompatParcelizer();

        Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

        Set<getRelatedLessonId> read();

        void read(Collection<getVariant> collection, setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap, getTimeStamp gettimestamp);

        Collection<CourseConfigV2SettingsItems> write(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

        Set<getRelatedLessonId> write();

        CourseConfigV2VideoProperties write(getRelatedLessonId getrelatedlessonid);
    }

    protected abstract RevisionSubjectStatusModel AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid);

    protected abstract void AudioAttributesCompatParcelizer(Collection<getVariant> collection, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap);

    protected abstract Set<getRelatedLessonId> IconCompatParcelizer();

    protected abstract Set<getRelatedLessonId> MediaBrowserCompatCustomActionResultReceiver();

    protected abstract Set<getRelatedLessonId> write();

    protected final McqTimeSpent AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    protected SchemaDetailLesson(McqTimeSpent mcqTimeSpent, List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> list, List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> list2, List<setActiveRecallQbankId.onCommand> list3, getCreatedOnDateMs<? extends Collection<getRelatedLessonId>> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(mcqTimeSpent, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.write = mcqTimeSpent;
        this.MediaBrowserCompatCustomActionResultReceiver = write(list, list2, list3);
        this.AudioAttributesCompatParcelizer = mcqTimeSpent.AudioAttributesImplApi21Parcelizer().read(new IconCompatParcelizer(getcreatedondatems));
        this.RemoteActionCompatParcelizer = mcqTimeSpent.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new read());
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        private /* synthetic */ getCreatedOnDateMs<Collection<getRelatedLessonId>> IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            return IntermediateLoginResponseBody.onPlayFromUri(this.IconCompatParcelizer.invoke());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getCreatedOnDateMs<? extends Collection<getRelatedLessonId>> getcreatedondatems) {
            super(0);
            this.IconCompatParcelizer = getcreatedondatems;
        }
    }

    public final Set<getRelatedLessonId> AudioAttributesImplApi26Parcelizer() {
        return (Set) Pearl.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, IconCompatParcelizer[0]);
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            Set<getRelatedLessonId> setWrite = SchemaDetailLesson.this.write();
            if (setWrite == null) {
                return null;
            }
            return getKycMessage.RemoteActionCompatParcelizer(getKycMessage.RemoteActionCompatParcelizer(SchemaDetailLesson.this.AudioAttributesImplApi26Parcelizer(), SchemaDetailLesson.this.MediaBrowserCompatCustomActionResultReceiver.read()), setWrite);
        }

        read() {
            super(0);
        }
    }

    private final Set<getRelatedLessonId> AudioAttributesImplBaseParcelizer() {
        return (Set) Pearl.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, IconCompatParcelizer[1]);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.write();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
    public Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return this.MediaBrowserCompatCustomActionResultReceiver.read(getrelatedlessonid, gettimestamp);
    }

    private final CourseConfigV2VideoProperties write(getRelatedLessonId getrelatedlessonid) {
        return this.MediaBrowserCompatCustomActionResultReceiver.write(getrelatedlessonid);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return this.MediaBrowserCompatCustomActionResultReceiver.write(getrelatedlessonid, gettimestamp);
    }

    protected final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        ArrayList arrayList = new ArrayList(0);
        setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.MediaBrowserCompatItemReceiver())) {
            AudioAttributesCompatParcelizer(arrayList, getanswermap);
        }
        ArrayList arrayList2 = arrayList;
        this.MediaBrowserCompatCustomActionResultReceiver.read(arrayList2, setoption6answeredcount, getanswermap, gettimestamp);
        setOption6AnsweredCount.write writeVar2 = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.IconCompatParcelizer())) {
            for (getRelatedLessonId getrelatedlessonid : AudioAttributesImplApi26Parcelizer()) {
                if (getanswermap.invoke(getrelatedlessonid).booleanValue()) {
                    SubjectGroupTypeConstant.write(arrayList2, IconCompatParcelizer(getrelatedlessonid));
                }
            }
        }
        setOption6AnsweredCount.write writeVar3 = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.MediaBrowserCompatCustomActionResultReceiver())) {
            for (getRelatedLessonId getrelatedlessonid2 : this.MediaBrowserCompatCustomActionResultReceiver.read()) {
                if (getanswermap.invoke(getrelatedlessonid2).booleanValue()) {
                    SubjectGroupTypeConstant.write(arrayList2, this.MediaBrowserCompatCustomActionResultReceiver.write(getrelatedlessonid2));
                }
            }
        }
        return SubjectGroupTypeConstant.IconCompatParcelizer(arrayList);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        if (RemoteActionCompatParcelizer(getrelatedlessonid)) {
            return IconCompatParcelizer(getrelatedlessonid);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver.read().contains(getrelatedlessonid)) {
            return write(getrelatedlessonid);
        }
        return null;
    }

    private final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        return this.write.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(getrelatedlessonid));
    }

    protected boolean RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return AudioAttributesImplApi26Parcelizer().contains(getrelatedlessonid);
    }

    private final RemoteActionCompatParcelizer write(List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> list, List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> list2, List<setActiveRecallQbankId.onCommand> list3) {
        this.write.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
        return new write(this, list, list2, list3);
    }

    final class write implements RemoteActionCompatParcelizer {
        private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(write.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(write.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        private final getListOfLessonCompletions<getRelatedLessonId, Collection<CourseConfigV2SupportItem>> AudioAttributesCompatParcelizer;
        private final Map<getRelatedLessonId, byte[]> AudioAttributesImplApi21Parcelizer;
        private final SchemaQbankItem<getRelatedLessonId, CourseConfigV2VideoProperties> AudioAttributesImplApi26Parcelizer;
        private final PageValue AudioAttributesImplBaseParcelizer;
        private final Map<getRelatedLessonId, byte[]> IconCompatParcelizer;
        private final Map<getRelatedLessonId, byte[]> MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ SchemaDetailLesson MediaBrowserCompatItemReceiver;
        private final getListOfLessonCompletions<getRelatedLessonId, Collection<CourseConfigV2SettingsItems>> RemoteActionCompatParcelizer;
        private final PageValue read;

        public write(SchemaDetailLesson schemaDetailLesson, List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> list, List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> list2, List<setActiveRecallQbankId.onCommand> list3) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            toMagicModuleMetaRepoModel.write(list3, "");
            this.MediaBrowserCompatItemReceiver = schemaDetailLesson;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                getRelatedLessonId getrelatedlessonid = FilterItemRecordCreator.read(schemaDetailLesson.AudioAttributesImplApi21Parcelizer().write(), ((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) ((BookReference) obj)).AudioAttributesImplBaseParcelizer());
                Object obj2 = linkedHashMap.get(getrelatedlessonid);
                if (obj2 == null) {
                    obj2 = (List) new ArrayList();
                    linkedHashMap.put(getrelatedlessonid, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.IconCompatParcelizer = write(linkedHashMap);
            SchemaDetailLesson schemaDetailLesson2 = this.MediaBrowserCompatItemReceiver;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                getRelatedLessonId getrelatedlessonid2 = FilterItemRecordCreator.read(schemaDetailLesson2.AudioAttributesImplApi21Parcelizer().write(), ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) ((BookReference) obj3)).MediaBrowserCompatItemReceiver());
                Object obj4 = linkedHashMap2.get(getrelatedlessonid2);
                if (obj4 == null) {
                    obj4 = (List) new ArrayList();
                    linkedHashMap2.put(getrelatedlessonid2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = write(linkedHashMap2);
            this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
            SchemaDetailLesson schemaDetailLesson3 = this.MediaBrowserCompatItemReceiver;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : list3) {
                getRelatedLessonId getrelatedlessonid3 = FilterItemRecordCreator.read(schemaDetailLesson3.AudioAttributesImplApi21Parcelizer().write(), ((setActiveRecallQbankId.onCommand) ((BookReference) obj5)).AudioAttributesImplBaseParcelizer());
                Object obj6 = linkedHashMap3.get(getrelatedlessonid3);
                if (obj6 == null) {
                    obj6 = (List) new ArrayList();
                    linkedHashMap3.put(getrelatedlessonid3, obj6);
                }
                ((List) obj6).add(obj5);
            }
            this.AudioAttributesImplApi21Parcelizer = write(linkedHashMap3);
            this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer());
            this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new read());
            this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new IconCompatParcelizer());
            this.read = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(new C0044write(this.MediaBrowserCompatItemReceiver));
            this.AudioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(new MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver));
        }

        static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                return write.this.RemoteActionCompatParcelizer(getrelatedlessonid);
            }

            AudioAttributesCompatParcelizer() {
                super(1);
            }
        }

        static final class read extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SettingsItems>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Collection<CourseConfigV2SettingsItems> invoke(getRelatedLessonId getrelatedlessonid) {
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                return write.this.AudioAttributesCompatParcelizer(getrelatedlessonid);
            }

            read() {
                super(1);
            }
        }

        static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, CourseConfigV2VideoProperties> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public CourseConfigV2VideoProperties invoke(getRelatedLessonId getrelatedlessonid) {
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                return write.this.IconCompatParcelizer(getrelatedlessonid);
            }

            IconCompatParcelizer() {
                super(1);
            }
        }

        /* JADX INFO: renamed from: o.SchemaDetailLesson$write$write, reason: collision with other inner class name */
        static final class C0044write extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
            private /* synthetic */ SchemaDetailLesson IconCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Set<getRelatedLessonId> invoke() {
                return getKycMessage.RemoteActionCompatParcelizer(write.this.IconCompatParcelizer.keySet(), this.IconCompatParcelizer.IconCompatParcelizer());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0044write(SchemaDetailLesson schemaDetailLesson) {
                super(0);
                this.IconCompatParcelizer = schemaDetailLesson;
            }
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
            return (Set) Pearl.RemoteActionCompatParcelizer(this.read, write[0]);
        }

        static final class MediaBrowserCompatItemReceiver extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
            private /* synthetic */ SchemaDetailLesson RemoteActionCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Set<getRelatedLessonId> invoke() {
                return getKycMessage.RemoteActionCompatParcelizer(write.this.MediaBrowserCompatCustomActionResultReceiver.keySet(), this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            MediaBrowserCompatItemReceiver(SchemaDetailLesson schemaDetailLesson) {
                super(0);
                this.RemoteActionCompatParcelizer = schemaDetailLesson;
            }
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final Set<getRelatedLessonId> write() {
            return (Set) Pearl.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, write[1]);
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final Set<getRelatedLessonId> read() {
            return this.AudioAttributesImplApi21Parcelizer.keySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.CourseConfigV2SupportItem> RemoteActionCompatParcelizer(kotlin.getRelatedLessonId r6) {
            /*
                r5 = this;
                java.util.Map<o.getRelatedLessonId, byte[]> r0 = r5.IconCompatParcelizer
                o.getParentMcqId<o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer> r1 = o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer
                java.lang.String r2 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r2)
                o.SchemaDetailLesson r3 = r5.MediaBrowserCompatItemReceiver
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2e
                o.SchemaDetailLesson r5 = r5.MediaBrowserCompatItemReceiver
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                o.SchemaDetailLesson$write$RemoteActionCompatParcelizer r0 = new o.SchemaDetailLesson$write$RemoteActionCompatParcelizer
                r0.<init>(r1, r4, r5)
                o.getCreatedOnDateMs r0 = (kotlin.getCreatedOnDateMs) r0
                o.getTopRankers r5 = kotlin.StateResult.IconCompatParcelizer(r0)
                java.util.List r5 = kotlin.StateResult.MediaBrowserCompatItemReceiver(r5)
                if (r5 == 0) goto L2e
                java.util.Collection r5 = (java.util.Collection) r5
                goto L34
            L2e:
                java.util.List r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
                java.util.Collection r5 = (java.util.Collection) r5
            L34:
                r0 = r5
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                int r5 = r5.size()
                r1.<init>(r5)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r5 = r0.iterator()
            L46:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L6e
                java.lang.Object r0 = r5.next()
                o.setActiveRecallQbankId$AudioAttributesImplApi26Parcelizer r0 = (o.setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) r0
                o.McqTimeSpent r4 = r3.AudioAttributesImplApi21Parcelizer()
                o.allFilterItem r4 = r4.read()
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r2)
                o.CourseConfigV2SupportItem r0 = r4.AudioAttributesCompatParcelizer(r0)
                boolean r4 = r3.write(r0)
                if (r4 != 0) goto L68
                r0 = 0
            L68:
                if (r0 == 0) goto L46
                r1.add(r0)
                goto L46
            L6e:
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r5 = r1
                java.util.List r5 = (java.util.List) r5
                r3.AudioAttributesCompatParcelizer(r6, r5)
                java.util.List r5 = kotlin.SubjectGroupTypeConstant.IconCompatParcelizer(r1)
                java.util.Collection r5 = (java.util.Collection) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SchemaDetailLesson.write.RemoteActionCompatParcelizer(o.getRelatedLessonId):java.util.Collection");
        }

        /* JADX INFO: Add missing generic type declarations: [M] */
        public static final class RemoteActionCompatParcelizer<M> extends MagicModuleUseCase implements getCreatedOnDateMs<M> {
            private /* synthetic */ SchemaDetailLesson AudioAttributesCompatParcelizer;
            private /* synthetic */ ByteArrayInputStream IconCompatParcelizer;
            private /* synthetic */ getParentMcqId<M> read;

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public BookReference invoke() {
                return (BookReference) this.read.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(getParentMcqId<M> getparentmcqid, ByteArrayInputStream byteArrayInputStream, SchemaDetailLesson schemaDetailLesson) {
                super(0);
                this.read = getparentmcqid;
                this.IconCompatParcelizer = byteArrayInputStream;
                this.AudioAttributesCompatParcelizer = schemaDetailLesson;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.CourseConfigV2SettingsItems> AudioAttributesCompatParcelizer(kotlin.getRelatedLessonId r6) {
            /*
                r5 = this;
                java.util.Map<o.getRelatedLessonId, byte[]> r0 = r5.MediaBrowserCompatCustomActionResultReceiver
                o.getParentMcqId<o.setActiveRecallQbankId$MediaBrowserCompatMediaItem> r1 = o.setActiveRecallQbankId.MediaBrowserCompatMediaItem.IconCompatParcelizer
                java.lang.String r2 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r2)
                o.SchemaDetailLesson r3 = r5.MediaBrowserCompatItemReceiver
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2e
                o.SchemaDetailLesson r5 = r5.MediaBrowserCompatItemReceiver
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                o.SchemaDetailLesson$write$RemoteActionCompatParcelizer r0 = new o.SchemaDetailLesson$write$RemoteActionCompatParcelizer
                r0.<init>(r1, r4, r5)
                o.getCreatedOnDateMs r0 = (kotlin.getCreatedOnDateMs) r0
                o.getTopRankers r5 = kotlin.StateResult.IconCompatParcelizer(r0)
                java.util.List r5 = kotlin.StateResult.MediaBrowserCompatItemReceiver(r5)
                if (r5 == 0) goto L2e
                java.util.Collection r5 = (java.util.Collection) r5
                goto L34
            L2e:
                java.util.List r5 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer()
                java.util.Collection r5 = (java.util.Collection) r5
            L34:
                r0 = r5
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                int r5 = r5.size()
                r1.<init>(r5)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r5 = r0.iterator()
            L46:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L65
                java.lang.Object r0 = r5.next()
                o.setActiveRecallQbankId$MediaBrowserCompatMediaItem r0 = (o.setActiveRecallQbankId.MediaBrowserCompatMediaItem) r0
                o.McqTimeSpent r4 = r3.AudioAttributesImplApi21Parcelizer()
                o.allFilterItem r4 = r4.read()
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r2)
                o.CourseConfigV2SettingsItems r0 = r4.read(r0)
                r1.add(r0)
                goto L46
            L65:
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r5 = r1
                java.util.List r5 = (java.util.List) r5
                r3.read(r6, r5)
                java.util.List r5 = kotlin.SubjectGroupTypeConstant.IconCompatParcelizer(r1)
                java.util.Collection r5 = (java.util.Collection) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SchemaDetailLesson.write.AudioAttributesCompatParcelizer(o.getRelatedLessonId):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CourseConfigV2VideoProperties IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            setActiveRecallQbankId.onCommand oncommand;
            byte[] bArr = this.AudioAttributesImplApi21Parcelizer.get(getrelatedlessonid);
            if (bArr == null || (oncommand = setActiveRecallQbankId.onCommand.read(new ByteArrayInputStream(bArr), this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer())) == null) {
                return null;
            }
            return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().read().AudioAttributesCompatParcelizer(oncommand);
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            return !AudioAttributesCompatParcelizer().contains(getrelatedlessonid) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : this.AudioAttributesCompatParcelizer.invoke(getrelatedlessonid);
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final CourseConfigV2VideoProperties write(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return this.AudioAttributesImplApi26Parcelizer.invoke(getrelatedlessonid);
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final Collection<CourseConfigV2SettingsItems> write(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            return !write().contains(getrelatedlessonid) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : this.RemoteActionCompatParcelizer.invoke(getrelatedlessonid);
        }

        @Override // o.SchemaDetailLesson.RemoteActionCompatParcelizer
        public final void read(Collection<getVariant> collection, setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(collection, "");
            toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
            if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.AudioAttributesImplBaseParcelizer())) {
                Set<getRelatedLessonId> setWrite = write();
                ArrayList arrayList = new ArrayList();
                for (getRelatedLessonId getrelatedlessonid : setWrite) {
                    if (getanswermap.invoke(getrelatedlessonid).booleanValue()) {
                        arrayList.addAll(write(getrelatedlessonid, gettimestamp));
                    }
                }
                McqContentBody.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = McqContentBody.AudioAttributesCompatParcelizer.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, "");
                IntermediateLoginResponseBody.IconCompatParcelizer(arrayList, audioAttributesCompatParcelizer);
                collection.addAll(arrayList);
            }
            setOption6AnsweredCount.write writeVar2 = setOption6AnsweredCount.IconCompatParcelizer;
            if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.read())) {
                Set<getRelatedLessonId> setAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                ArrayList arrayList2 = new ArrayList();
                for (getRelatedLessonId getrelatedlessonid2 : setAudioAttributesCompatParcelizer) {
                    if (getanswermap.invoke(getrelatedlessonid2).booleanValue()) {
                        arrayList2.addAll(read(getrelatedlessonid2, gettimestamp));
                    }
                }
                McqContentBody.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = McqContentBody.AudioAttributesCompatParcelizer.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer2, "");
                IntermediateLoginResponseBody.IconCompatParcelizer(arrayList2, audioAttributesCompatParcelizer2);
                collection.addAll(arrayList2);
            }
        }

        private static Map<getRelatedLessonId, byte[]> write(Map<getRelatedLessonId, ? extends Collection<? extends setNotesCount>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(VideoTimelineResponseBody.read(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((setNotesCount) it2.next()).read(byteArrayOutputStream);
                    arrayList.add(getShowPopup.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    protected void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, List<CourseConfigV2SupportItem> list) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(list, "");
    }

    protected void read(getRelatedLessonId getrelatedlessonid, List<CourseConfigV2SettingsItems> list) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(list, "");
    }

    protected boolean write(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
        return true;
    }
}
