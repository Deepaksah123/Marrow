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
  "frontend/quizx/Brain/Marrow" \
  "frontend/quizx/marrow" \
  "frontend/1234xxx/marrow" \
  "frontend/datax/marrow" \
  "frontend/srcx/platforms/marrow"

cd "$ROOT"
mkdir -p "$DEST/Brain/Marrow" "$DEST/quizx/marrow" "$DEST/1234xxx/marrow" "$DEST/datax/marrow" "$DEST/srcx/platforms/marrow"
cp -a "$TMP_DIR/repo/frontend/quizx/Brain/Marrow/." "$DEST/Brain/Marrow/"
cp -a "$TMP_DIR/repo/frontend/quizx/marrow/." "$DEST/quizx/marrow/"
cp -a "$TMP_DIR/repo/frontend/1234xxx/marrow/." "$DEST/1234xxx/marrow/"
cp -a "$TMP_DIR/repo/frontend/datax/marrow/." "$DEST/datax/marrow/"
cp -a "$TMP_DIR/repo/frontend/srcx/platforms/marrow/." "$DEST/srcx/platforms/marrow/"

cat > "$DEST/README.md" <<\x27EOF\x27
# Marrow Content

This folder contains only Marrow educational content materialized from WEBREPLITX5. Edition 8 QBank is the active QBank source. Legacy/duplicate Marrow6 content is intentionally excluded.
EOF

echo "Marrow source synced into $DEST"
find "$DEST" -type f | wc -l
du -sh "$DEST"
