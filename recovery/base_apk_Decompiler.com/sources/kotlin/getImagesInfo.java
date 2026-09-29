package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.isActiveForNewTag;
import kotlin.setOption5AnsweredCount;

/* JADX INFO: loaded from: classes4.dex */
public final class getImagesInfo {
    private final isImageContent AudioAttributesCompatParcelizer;
    private final ConcurrentHashMap<RevisionSubjectStatusModel, setTags> IconCompatParcelizer;
    private final getBooleanFlags RemoteActionCompatParcelizer;

    public getImagesInfo(getBooleanFlags getbooleanflags, isImageContent isimagecontent) {
        toMagicModuleMetaRepoModel.write(getbooleanflags, "");
        toMagicModuleMetaRepoModel.write(isimagecontent, "");
        this.RemoteActionCompatParcelizer = getbooleanflags;
        this.AudioAttributesCompatParcelizer = isimagecontent;
        this.IconCompatParcelizer = new ConcurrentHashMap<>();
    }

    public final setTags RemoteActionCompatParcelizer(getMsInterimHtmlStartTime getmsinterimhtmlstarttime) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getmsinterimhtmlstarttime, "");
        ConcurrentHashMap<RevisionSubjectStatusModel, setTags> concurrentHashMap = this.IconCompatParcelizer;
        RevisionSubjectStatusModel revisionSubjectStatusModel = getmsinterimhtmlstarttime.read();
        setTags settagsRemoteActionCompatParcelizer = concurrentHashMap.get(revisionSubjectStatusModel);
        if (settagsRemoteActionCompatParcelizer == null) {
            getNotesCount getnotescountRemoteActionCompatParcelizer = getmsinterimhtmlstarttime.read().RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
            if (getmsinterimhtmlstarttime.write().RemoteActionCompatParcelizer() == isActiveForNewTag.IconCompatParcelizer.MULTIFILE_CLASS) {
                List<String> listAudioAttributesImplApi21Parcelizer = getmsinterimhtmlstarttime.write().AudioAttributesImplApi21Parcelizer();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listAudioAttributesImplApi21Parcelizer.iterator();
                while (it.hasNext()) {
                    RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(setMcqType.read((String) it.next()).RemoteActionCompatParcelizer());
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
                    getMasterOrder getmasterorderRemoteActionCompatParcelizer = getLessonType.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, revisionSubjectStatusModelRemoteActionCompatParcelizer, SubjectFilterModel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.read().RemoteActionCompatParcelizer()));
                    if (getmasterorderRemoteActionCompatParcelizer != null) {
                        arrayList.add(getmasterorderRemoteActionCompatParcelizer);
                    }
                }
                arrayListRemoteActionCompatParcelizer = arrayList;
            } else {
                arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getmsinterimhtmlstarttime);
            }
            getDoubleMap getdoublemap = new getDoubleMap(this.RemoteActionCompatParcelizer.read().MediaBrowserCompatMediaItem(), getnotescountRemoteActionCompatParcelizer);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListRemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                setTags settagsWrite = this.RemoteActionCompatParcelizer.write(getdoublemap, (getMasterOrder) it2.next());
                if (settagsWrite != null) {
                    arrayList2.add(settagsWrite);
                }
            }
            List listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList2);
            setOption5AnsweredCount.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setOption5AnsweredCount.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("package ");
            sb.append(getnotescountRemoteActionCompatParcelizer);
            sb.append(" (");
            sb.append(getmsinterimhtmlstarttime);
            sb.append(')');
            settagsRemoteActionCompatParcelizer = setOption5AnsweredCount.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(sb.toString(), listOnPlay);
            setTags settagsPutIfAbsent = concurrentHashMap.putIfAbsent(revisionSubjectStatusModel, settagsRemoteActionCompatParcelizer);
            if (settagsPutIfAbsent != null) {
                settagsRemoteActionCompatParcelizer = settagsPutIfAbsent;
            }
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsRemoteActionCompatParcelizer, "");
        return settagsRemoteActionCompatParcelizer;
    }
}
