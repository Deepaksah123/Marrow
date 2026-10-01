#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
TMP_DIR="${RUNNER_TEMP:-/tmp}/marrow-source"
DEST="$ROOT/app/src/main/assets/marrow_content"

rm -rf "$TMP_DIR" "$DEST"
mkdir -p "$TMP_DIR" "$DEST"

git clone --depth 1 --filter=blob:none --sparse \
  https://github.com/sunday2212/WEBREPLITX5.git "$TMP_DIR/repo"

cd "$TMP_DIR/repo"
git sparse-checkout set \
  "frontend/quizx/Brain/Marrow/Edition 8 qBank"

cd "$ROOT"
mkdir -p "$DEST/Brain/Marrow/Edition 8 qBank"

# Canonical active QBank only. Do NOT import GT, Mini Test, PYQ,
# FMGE test series, or other Marrow catalogue/content trees.
cp -a "$TMP_DIR/repo/frontend/quizx/Brain/Marrow/Edition 8 qBank/." \
  "$DEST/Brain/Marrow/Edition 8 qBank/"

# This file is user-provided and is the sole Pearls content source.
cp "$ROOT/Marrow_pearls.html" "$ROOT/app/src/main/assets/Marrow_pearls.html"

cat > "$DEST/README.md" <<'EOF'
# Marrow Content

Canonical active content currently materialized here:
- Edition 8 QBank only, from the verified Marrow QBank source.

Explicitly NOT imported from WEBREPLITX5:
- Grand Tests
- Mini Tests
- PYQ / Previous Year content
- FMGE Test Series
- other Marrow catalogue/content trees

Pearls are sourced separately from the user-provided Marrow_pearls.html.
EOF

echo "Marrow Edition 8 QBank synced into $DEST"
find "$DEST" -type f | wc -l
du -sh "$DEST"
