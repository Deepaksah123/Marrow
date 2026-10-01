#!/usr/bin/env python3
import json, pathlib, hashlib, os, urllib.request
from collections import Counter, defaultdict

APP=pathlib.Path("app/src/main/assets/marrow_content/Brain/Marrow/Edition 8 qBank")
SOURCE_PREFIX="frontend/quizx/Brain/Marrow/Edition 8 qBank/"
APP_PREFIX="app/src/main/assets/marrow_content/Brain/Marrow/Edition 8 qBank/"
SOURCE_API="https://api.github.com/repos/sunday2212/WEBREPLITX5/git/trees/HEAD?recursive=1"
APP_API="https://api.github.com/repos/Deepaksah123/Marrow/git/trees/HEAD?recursive=1"

def api(url):
    headers={"Accept":"application/vnd.github+json","User-Agent":"Marrow-Edition8-Audit"}
    token=os.environ.get("GITHUB_TOKEN") or os.environ.get("GH_TOKEN")
    if token:
        headers["Authorization"]=f"Bearer {token}"
    req=urllib.request.Request(url,headers=headers)
    with urllib.request.urlopen(req,timeout=60) as f: return json.load(f)

def app_scan(root):
    files={}; qcount=0; ids=[]; locations=defaultdict(list); malformed=[]; empty=[]; field_issues=[]; subjects=defaultdict(lambda:[0,0])
    for p in sorted(root.rglob("*.json")):
        rel=p.relative_to(root).as_posix(); raw=p.read_bytes(); files[rel]=hashlib.sha256(raw).hexdigest()
        try: data=json.loads(raw.decode("utf-8"))
        except Exception as e: malformed.append([rel,str(e)]); continue
        qs=data.get("questions")
        if not isinstance(qs,list): malformed.append([rel,"questions is not a list"]); continue
        sub=rel.split("/",1)[0]; subjects[sub][0]+=1; subjects[sub][1]+=len(qs); qcount+=len(qs)
        for i,q in enumerate(qs):
            if not isinstance(q,dict): malformed.append([rel,f"question[{i}] is not object"]); continue
            qid=q.get("question_id"); ids.append(qid); locations[qid].append([rel,i])
            if not q.get("text") or not isinstance(q.get("choices"),list) or not q.get("choices"): empty.append([rel,qid,i])
            if "correct_choice_id" not in q: field_issues.append([rel,qid,"missing correct_choice_id"])
            if "solution" not in q: field_issues.append([rel,qid,"missing solution"])
            for j,c in enumerate(q.get("choices") or []):
                if not isinstance(c,dict) or not c.get("text"): field_issues.append([rel,qid,f"choice[{j}] missing text"])
    return files,qcount,ids,locations,malformed,empty,field_issues,subjects

source_tree=api(SOURCE_API)["tree"]; app_tree=api(APP_API)["tree"]
S={x["path"][len(SOURCE_PREFIX):]:x["sha"] for x in source_tree if x["type"]=="blob" and x["path"].startswith(SOURCE_PREFIX)}
A={x["path"][len(APP_PREFIX):]:x["sha"] for x in app_tree if x["type"]=="blob" and x["path"].startswith(APP_PREFIX)}
missing=sorted(set(S)-set(A)); extra=sorted(set(A)-set(S)); changed=sorted(k for k in S if k in A and S[k]!=A[k])

af,aq,ids,loc,mal,emp,issues,subs=app_scan(APP)
cnt=Counter(x for x in ids if x is not None); dup=sorted(k for k,v in cnt.items() if v>1)
out=[
f"SOURCE_FILES_BY_GIT_TREE={len(S)}",f"APP_FILES_BY_GIT_TREE={len(A)}",
f"MISSING_FILES={len(missing)}",f"EXTRA_FILES={len(extra)}",f"CHANGED_BLOB_SHAS={len(changed)}",
f"APP_FILES_SCANNED={len(af)}",f"APP_QUESTIONS={aq}",f"APP_IDS={len(ids)}",f"APP_UNIQUE_IDS={len(cnt)}",f"DUP_APP_IDS={len(dup)}",
f"APP_MALFORMED={len(mal)}",f"APP_EMPTY={len(emp)}",f"APP_FIELD_ISSUES={len(issues)}","SUBJECTS:"
]
for s in sorted(subs): out.append(f"{s}|FILES={subs[s][0]}|QUESTIONS={subs[s][1]}")
out += ["MISSING_FILES_LIST="+repr(missing),"EXTRA_FILES_LIST="+repr(extra),"CHANGED_BLOB_SHAS_LIST="+repr(changed),
        "DUP_APP_ID_LOCATIONS="+repr({k:loc[k] for k in dup}),"APP_MALFORMED_LIST="+repr(mal[:200]),
        "APP_EMPTY_LIST="+repr(emp[:200]),"APP_FIELD_ISSUES_LIST="+repr(issues[:200])]
pathlib.Path("edition8_audit_result.txt").write_text("\n".join(out)+"\n",encoding="utf-8")
print("\n".join(out))
