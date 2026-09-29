package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class isInternMode {
    private final Map<String, setDownloaded> write = new LinkedHashMap();

    public final class write {
        private /* synthetic */ isInternMode read;
        private final String write;

        public write(isInternMode isinternmode, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = isinternmode;
            this.write = str;
        }

        public final String write() {
            return this.write;
        }

        public final void write(String str, getAnswerMap<? super C0116write, getShowPopup> getanswermap) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            Map map = this.read.write;
            C0116write c0116write = new C0116write(this, str);
            getanswermap.invoke(c0116write);
            Pair<String, setDownloaded> pairAudioAttributesCompatParcelizer = c0116write.AudioAttributesCompatParcelizer();
            map.put(pairAudioAttributesCompatParcelizer.write(), pairAudioAttributesCompatParcelizer.IconCompatParcelizer());
        }

        /* JADX INFO: renamed from: o.isInternMode$write$write, reason: collision with other inner class name */
        public final class C0116write {
            private Pair<String, VideoSubModelCompanion> AudioAttributesCompatParcelizer;
            private final String IconCompatParcelizer;
            private /* synthetic */ write read;
            private final List<Pair<String, VideoSubModelCompanion>> write;

            public C0116write(write writeVar, String str) {
                toMagicModuleMetaRepoModel.write(str, "");
                this.read = writeVar;
                this.IconCompatParcelizer = str;
                this.write = new ArrayList();
                this.AudioAttributesCompatParcelizer = setAction.write("V", null);
            }

            public final void write(String str, getSubject... getsubjectArr) {
                VideoSubModelCompanion videoSubModelCompanion;
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(getsubjectArr, "");
                List<Pair<String, VideoSubModelCompanion>> list = this.write;
                if (getsubjectArr.length == 0) {
                    videoSubModelCompanion = null;
                } else {
                    Iterable<SyncResult> iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getOrderDetails.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getsubjectArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 10)), 16));
                    for (SyncResult syncResult : iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                        int iAudioAttributesCompatParcelizer = syncResult.AudioAttributesCompatParcelizer();
                        linkedHashMap.put(Integer.valueOf(iAudioAttributesCompatParcelizer), (getSubject) syncResult.write());
                    }
                    videoSubModelCompanion = new VideoSubModelCompanion(linkedHashMap);
                }
                list.add(setAction.write(str, videoSubModelCompanion));
            }

            public final void read(String str, getSubject... getsubjectArr) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(getsubjectArr, "");
                Iterable<SyncResult> iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getOrderDetails.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getsubjectArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 10)), 16));
                for (SyncResult syncResult : iterableMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    int iAudioAttributesCompatParcelizer = syncResult.AudioAttributesCompatParcelizer();
                    linkedHashMap.put(Integer.valueOf(iAudioAttributesCompatParcelizer), (getSubject) syncResult.write());
                }
                this.AudioAttributesCompatParcelizer = setAction.write(str, new VideoSubModelCompanion(linkedHashMap));
            }

            public final void write(setOption2AnsweredCount setoption2answeredcount) {
                toMagicModuleMetaRepoModel.write(setoption2answeredcount, "");
                String strAudioAttributesCompatParcelizer = setoption2answeredcount.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                this.AudioAttributesCompatParcelizer = setAction.write(strAudioAttributesCompatParcelizer, null);
            }

            public final Pair<String, setDownloaded> AudioAttributesCompatParcelizer() {
                getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
                String strWrite = this.read.write();
                String str = this.IconCompatParcelizer;
                List<Pair<String, VideoSubModelCompanion>> list = this.write;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).write());
                }
                String strAudioAttributesCompatParcelizer = getPeopleSolved.AudioAttributesCompatParcelizer(strWrite, getPeopleSolved.RemoteActionCompatParcelizer(str, arrayList, this.AudioAttributesCompatParcelizer.write()));
                VideoSubModelCompanion videoSubModelCompanionIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
                List<Pair<String, VideoSubModelCompanion>> list2 = this.write;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((VideoSubModelCompanion) ((Pair) it2.next()).IconCompatParcelizer());
                }
                return setAction.write(strAudioAttributesCompatParcelizer, new setDownloaded(videoSubModelCompanionIconCompatParcelizer, arrayList2));
            }
        }
    }

    public final Map<String, setDownloaded> AudioAttributesCompatParcelizer() {
        return this.write;
    }
}
