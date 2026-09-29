#!/usr/bin/env python3
import json, pathlib, hashlib, re
from collections import Counter, defaultdict
SRC=pathlib.Path("/tmp/marrow-source/repo/frontend/quizx/Brain/Marrow/Edition 8 qBank")
DST=pathlib.Path("app/src/main/assets/marrow_content/Brain/Marrow/Edition 8 qBank")
def scan(root):
    files={}; qcount=0; ids=[]; malformed=[]; empty=[]; field_issues=[]; subjects=defaultdict(lambda:[0,0]); sigs={}
    for p in sorted(root.rglob("*.json")):
        rel=p.relative_to(root).as_posix(); raw=p.read_bytes(); files[rel]=hashlib.sha256(raw).hexdigest()
        try: data=json.loads(raw.decode("utf-8"))
        except Exception as e: malformed.append([rel,str(e)]); continue
        qs=data.get("questions")
        if not isinstance(qs,list): malformed.append([rel,"questions is not a list"]); continue
        sub=rel.split("/",1)[0]; subjects[sub][0]+=1; subjects[sub][1]+=len(qs); qcount+=len(qs)
        for i,q in enumerate(qs):
            if not isinstance(q,dict): malformed.append([rel,f"question[{i}] is not object"]); continue
            qid=q.get("question_id"); ids.append(qid)
            if not q.get("text") or not isinstance(q.get("choices"),list) or not q.get("choices"): empty.append([rel,qid,i])
            if "correct_choice_id" not in q: field_issues.append([rel,qid,"missing correct_choice_id"])
            if "solution" not in q: field_issues.append([rel,qid,"missing solution"])
            for j,c in enumerate(q.get("choices") or []):
                if not isinstance(c,dict) or not c.get("text"): field_issues.append([rel,qid,f"choice[{j}] missing text"])
            sig=json.dumps({"id":qid,"text":q.get("text"),"choices":q.get("choices"),"correct_choice_id":q.get("correct_choice_id"),"solution":q.get("solution"),"question_images":q.get("question_images"),"explanation_images":q.get("explanation_images")},ensure_ascii=False,sort_keys=True,separators=(",",":"))
            sigs[qid]=hashlib.sha256(sig.encode()).hexdigest() if qid is not None else None
    return files,qcount,ids,malformed,empty,field_issues,subjects,sigs
sf,sq,sids,sm,se,sfi,ss,ssig=scan(SRC); df,dq,dids,dm,de,dfi,ds,dsig=scan(DST)
missing=sorted(set(sf)-set(df)); extra=sorted(set(df)-set(sf)); changed=sorted(k for k in sf if k in df and sf[k]!=df[k])
sc=Counter(x for x in sids if x is not None); dc=Counter(x for x in dids if x is not None)
missing_ids=sorted(set(sc)-set(dc)); extra_ids=sorted(set(dc)-set(sc)); dup_src=sorted(k for k,v in sc.items() if v>1); dup_dst=sorted(k for k,v in dc.items() if v>1)
semantic_changed=sorted(k for k in set(sc)&set(dc) if ssig.get(k)!=dsig.get(k))
out=[f"SOURCE_FILES={len(sf)}",f"APP_FILES={len(df)}",f"SOURCE_QUESTIONS={sq}",f"APP_QUESTIONS={dq}",f"MISSING_FILES={len(missing)}",f"EXTRA_FILES={len(extra)}",f"CHANGED_FILE_HASHES={len(changed)}",f"SOURCE_IDS={len(sids)}",f"APP_IDS={len(dids)}",f"SOURCE_UNIQUE_IDS={len(sc)}",f"APP_UNIQUE_IDS={len(dc)}",f"MISSING_IDS={len(missing_ids)}",f"EXTRA_IDS={len(extra_ids)}",f"DUP_SOURCE_IDS={len(dup_src)}",f"DUP_APP_IDS={len(dup_dst)}",f"SEMANTICALLY_CHANGED_COMMON_IDS={len(semantic_changed)}",f"SOURCE_MALFORMED={len(sm)}",f"APP_MALFORMED={len(dm)}",f"SOURCE_EMPTY={len(se)}",f"APP_EMPTY={len(de)}",f"SOURCE_FIELD_ISSUES={len(sfi)}",f"APP_FIELD_ISSUES={len(dfi)}","SUBJECTS:"]
for s in sorted(set(ss)|set(ds)): out.append(f"{s}|SRC_FILES={ss.get(s,[0,0])[0]}|APP_FILES={ds.get(s,[0,0])[0]}|SRC_Q={ss.get(s,[0,0])[1]}|APP_Q={ds.get(s,[0,0])[1]}")
for name,val in [("MISSING_FILES",missing),("EXTRA_FILES",extra),("CHANGED_FILE_HASHES",changed),("MISSING_IDS",missing_ids),("EXTRA_IDS",extra_ids),("DUP_SOURCE_IDS",dup_src),("DUP_APP_IDS",dup_dst),("SEMANTICALLY_CHANGED_COMMON_IDS",semantic_changed),("SOURCE_MALFORMED",sm),("APP_MALFORMED",dm),("SOURCE_EMPTY",se),("APP_EMPTY",de),("SOURCE_FIELD_ISSUES",sfi),("APP_FIELD_ISSUES",dfi)]: out.append(name+"_LIST="+repr(val[:200]))
pathlib.Path("edition8_audit_result.txt").write_text("\n".join(out)+"\n",encoding="utf-8"); print("\n".join(out))
